package nl.bsoft.data.graphql.config.h2.repo;

import nl.bsoft.data.graphql.model.h2.VehicleH2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepositoryH2 extends JpaRepository<VehicleH2, Integer> {
}
