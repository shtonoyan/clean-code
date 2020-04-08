package planes.plane_types.plane_models.militaryp_plane_models;

import models.MilitaryType;
import planes.plane_types.MilitaryPlane;

public class B1BLancer extends MilitaryPlane {
    public B1BLancer(){
        modelName = "B-1B Lancer";
        maxSpeed = 1050;
        maxFlightDistance = 21000;
        maxLoadCapacity = 80000;
        type = MilitaryType.BOMBER;
    }
}
