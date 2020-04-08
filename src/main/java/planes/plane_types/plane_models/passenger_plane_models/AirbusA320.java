package planes.plane_types.plane_models.passenger_plane_models;

import planes.plane_types.PassengerPlane;

public class AirbusA320 extends PassengerPlane {
    public AirbusA320(){
        modelName ="Airbus A320";
        maxSpeed = 930;
        maxFlightDistance = 11800;
        maxLoadCapacity = 65500;
        passengersCapacity = 188;
    }
}
