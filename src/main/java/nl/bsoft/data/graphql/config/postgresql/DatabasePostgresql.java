package nl.bsoft.data.graphql.config.postgresql;

import com.zaxxer.hikari.HikariDataSource;
import io.micrometer.prometheus.PrometheusMeterRegistry;
import liquibase.integration.spring.SpringLiquibase;
import lombok.extern.slf4j.Slf4j;
import nl.bsoft.data.graphql.config.DatabaseConfig;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.Objects;
import java.util.Properties;

@Slf4j
@Configuration
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactoryPg",
        transactionManagerRef = "transactionManagerPg"
)
public class DatabasePostgresql extends DatabaseConfig {

    private PrometheusMeterRegistry prometheusMeterRegistry;

    public DatabasePostgresql(final PrometheusMeterRegistry prometheusMeterRegistry) {
        this.prometheusMeterRegistry = prometheusMeterRegistry;
    }

    @Bean
    @Primary
    @ConfigurationProperties("postgres.datasource")
    public DataSourceProperties pgDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("postgres.datasource.configuration")
    public HikariDataSource dataSource() {
        log.info("datasourcepg config: {}", pgDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build().toString());
        return pgDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @PostConstruct
    public void setUpHikariWithMetrics() {
        if (dataSource() instanceof HikariDataSource) {
            dataSource().setMetricRegistry(prometheusMeterRegistry);
        }
    }

    @Bean
    public SessionFactory sfPostgres(@Qualifier("entityManagerFactoryPg") final LocalContainerEntityManagerFactoryBean entityManagerFactoryPg) {
        return Objects.requireNonNull(entityManagerFactoryPg.getObject()).unwrap(SessionFactory.class);
    }

    @Bean
    @ConfigurationProperties(prefix = "datasource.postgres.liquibase")
    public LiquibaseProperties liquibaseProperties() {
        return new LiquibaseProperties();
    }

    @Bean(name = "liquibase")
    @DependsOn("dataSource")
    @Primary
    public SpringLiquibase liquibase(@Qualifier("dataSource") final DataSource dataSource,
                                     @Qualifier("liquibaseProperties") LiquibaseProperties liquibaseProperties) {
        return springLiquibase(dataSource, liquibaseProperties);
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPg(@Qualifier("dataSource") final DataSource dataSource) {
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.setJpaProperties(hibernateProperties());
        factoryBean.setPackagesToScan("nl.bsoft.data.graphql.config.repo", "nl.bsoft.data.graphql.model.postgresql");
        factoryBean.setPersistenceUnitName("postgres-unit");

        //factoryBean.setSharedCacheMode(SharedCacheMode.ALL);
        return factoryBean;
    }

    @Bean
    public PlatformTransactionManager transactionManagerPg(@Qualifier("entityManagerFactoryPg") LocalContainerEntityManagerFactoryBean entityManagerFactoryPg) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactoryPg.getObject());
        return transactionManager;
    }

    private Properties hibernateProperties() {
        final Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        return hibernateProperties;
    }

}
