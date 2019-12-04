package nl.bsoft.data.graphql.config.postgresql.repo;

import nl.bsoft.data.graphql.model.postgresql.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepositoryPg extends JpaRepository<Vehicle, Integer> {
}
