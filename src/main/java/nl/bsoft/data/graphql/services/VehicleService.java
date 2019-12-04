package nl.bsoft.data.graphql.services;

import nl.bsoft.data.graphql.config.postgresql.repo.VehicleRepositoryPg;
import nl.bsoft.data.graphql.model.postgresql.Vehicle;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleService {
    private final VehicleRepositoryPg vehicleRepository;
    //private final PlatformTransactionManager transactionManagerPg;

    public VehicleService(//final PlatformTransactionManager transactionManagerPg,
                          final VehicleRepositoryPg vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
        //this.transactionManagerPg = transactionManagerPg;
    }


    @Transactional(transactionManager = "transactionManagerPg")
    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        final Vehicle vehicle = new Vehicle();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        vehicle.setLaunchDate(LocalDate.parse(launchDate));
        return this.vehicleRepository.save(vehicle);
    }

    @Transactional(readOnly = true, transactionManager = "transactionManagerPg")
    public List<Vehicle> getAllVehicles(final int count) {
        return this.vehicleRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true, transactionManager = "transactionManagerPg")
    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleRepository.findById(id);
    }
}