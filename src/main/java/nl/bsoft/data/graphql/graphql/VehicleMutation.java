package nl.bsoft.data.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import nl.bsoft.data.graphql.model.postgresql.Vehicle;
import nl.bsoft.data.graphql.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutation implements GraphQLMutationResolver {
    @Autowired
    private VehicleService vehicleService;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}