package planes.plane_types.plane_models.experimental_plane_models;

import models.ClassificationLevel;
import models.ExperimentalTypes;
import planes.plane_types.ExperimentalPlane;

public class RyanX13Vertijet extends ExperimentalPlane {
    public RyanX13Vertijet(){
        modelName = "Ryan X-13 Vertijet";
        maxSpeed = 560;
        maxFlightDistance = 307;
        maxLoadCapacity = 500;
        experimentalTypes = ExperimentalTypes.VTOL;
        classificationLevel = ClassificationLevel.TOP_SECRET;
    }
}
