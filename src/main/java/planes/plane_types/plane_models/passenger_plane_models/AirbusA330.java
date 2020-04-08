package planes.plane_types.plane_models.passenger_plane_models;

import planes.plane_types.PassengerPlane;

public class AirbusA330 extends PassengerPlane {
    public AirbusA330() {
        modelName = "Airbus A330";
        maxSpeed = 990;
        maxFlightDistance = 14800;
        maxLoadCapacity = 80500;
        passengersCapacity = 222;
    }
}
