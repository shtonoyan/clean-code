package planes.plane_types.plane_models.militaryp_plane_models;

import models.MilitaryType;
import planes.plane_types.MilitaryPlane;

public class B2Spirit extends MilitaryPlane {
    public B2Spirit() {
        modelName = "B-2 Spirit";
        maxSpeed = 1030;
        maxFlightDistance = 22000;
        maxLoadCapacity = 70000;
        type = MilitaryType.BOMBER;
    }
}
