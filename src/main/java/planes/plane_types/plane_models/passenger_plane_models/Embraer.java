package planes.plane_types.plane_models.passenger_plane_models;

import planes.plane_types.PassengerPlane;

public class Embraer extends PassengerPlane {
    public Embraer() {
        modelName = "Embraer 190";
        maxSpeed = 870;
        maxFlightDistance = 8100;
        maxLoadCapacity = 30800;
        passengersCapacity = 64;
    }
}
