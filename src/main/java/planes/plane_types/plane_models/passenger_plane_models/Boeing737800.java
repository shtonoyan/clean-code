package planes.plane_types.plane_models.passenger_plane_models;

import planes.plane_types.PassengerPlane;

public class Boeing737800 extends PassengerPlane {
    public Boeing737800() {
        modelName="Boeing-737-800";
        maxSpeed = 940;
        maxFlightDistance = 12300;
        maxLoadCapacity = 63870;
        passengersCapacity = 192;
    }
}
