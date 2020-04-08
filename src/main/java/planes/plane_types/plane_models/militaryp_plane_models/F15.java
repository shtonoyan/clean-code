package planes.plane_types.plane_models.militaryp_plane_models;

import models.MilitaryType;
import planes.plane_types.MilitaryPlane;

public class F15 extends MilitaryPlane {
    public F15(){
        modelName = "F-15";
        maxSpeed = 1500;
        maxFlightDistance = 12000;
        maxLoadCapacity = 10000;
        type = MilitaryType.BOMBER;
    }
}
