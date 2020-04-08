package planes.plane_types.plane_models.passenger_plane_models;

import planes.plane_types.PassengerPlane;

public class BombardierCS300 extends PassengerPlane {
    public BombardierCS300(){
        modelName="Bombardier CS300";
        maxSpeed = 920;
        maxFlightDistance = 11000;
        maxLoadCapacity = 60700;
        passengersCapacity = 196;
    }
}
