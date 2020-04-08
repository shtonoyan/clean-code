package planes.plane_types.plane_models.experimental_plane_models;

import models.ClassificationLevel;
import models.ExperimentalTypes;
import planes.plane_types.ExperimentalPlane;

public class BellX14 extends ExperimentalPlane {
    public BellX14(){
        modelName = "Bell X-14";
        maxSpeed = 277;
        maxFlightDistance = 480;
        maxLoadCapacity = 500;
        experimentalTypes =ExperimentalTypes.HIGH_ALTITUDE;
        classificationLevel= ClassificationLevel.SECRET;
    }
}
