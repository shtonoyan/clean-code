package planes.plane_types.plane_models.passenger_plane_models;

import planes.plane_types.PassengerPlane;

public class Boeing747 extends PassengerPlane {
    public Boeing747(){
        modelName="Boeing-747";
        maxSpeed = 980;
        maxFlightDistance = 16100;
        maxLoadCapacity = 70500;
        passengersCapacity = 242;
    }
}
