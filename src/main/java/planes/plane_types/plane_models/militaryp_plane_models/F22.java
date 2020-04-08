package planes.plane_types.plane_models.militaryp_plane_models;

import models.MilitaryType;
import planes.plane_types.MilitaryPlane;

public class F22 extends MilitaryPlane {
    public F22(){
        modelName = "F-22";
        maxSpeed = 1550;
        maxFlightDistance = 13000;
        maxLoadCapacity = 11000;
        type = MilitaryType.BOMBER;
    }
}
