package planes.plane_types.plane_models.militaryp_plane_models;

import models.MilitaryType;
import planes.plane_types.MilitaryPlane;

public class C130Hercules extends MilitaryPlane {
    public C130Hercules(){
        modelName = "C-130 Hercules";
        maxSpeed = 650;
        maxFlightDistance = 5000;
        maxLoadCapacity = 110000;
        type = MilitaryType.TRANSPORT;
    }
}
