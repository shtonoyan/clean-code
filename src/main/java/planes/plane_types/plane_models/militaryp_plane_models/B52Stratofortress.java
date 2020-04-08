package planes.plane_types.plane_models.militaryp_plane_models;

import models.MilitaryType;
import planes.plane_types.MilitaryPlane;

public class B52Stratofortress extends MilitaryPlane {
    public B52Stratofortress(){
        modelName = "B-52 Stratofortress";
        maxSpeed = 1000;
        maxFlightDistance = 20000;
        maxLoadCapacity = 80000;
        type = MilitaryType.BOMBER;

    }
}
