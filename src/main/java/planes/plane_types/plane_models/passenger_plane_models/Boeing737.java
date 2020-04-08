package planes.plane_types.plane_models.passenger_plane_models;

import planes.plane_types.PassengerPlane;

public class Boeing737 extends PassengerPlane {
    public Boeing737() {
        modelName="Boeing-737";
        maxSpeed = 900;
        maxFlightDistance = 12000;
        maxLoadCapacity = 60500;
        passengersCapacity = 164;
    }
}
