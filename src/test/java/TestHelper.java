import models.ClassificationLevel;
import models.MilitaryType;
import planes.Plane;
import planes.plane_types.ExperimentalPlane;
import planes.plane_types.MilitaryPlane;

import java.util.List;
import java.util.stream.Collectors;

public class TestHelper {

    public boolean isListContainsTransportOnly(List<MilitaryPlane> transportMilitaryPlanes) {
        return transportMilitaryPlanes
                .stream()
                .map(MilitaryPlane::getType)
                .allMatch(planeType -> planeType.equals(MilitaryType.TRANSPORT));
    }

    public boolean isListSortedByMaxLoadCapacity(List<? extends Plane> planes) {
        List<Integer> maxLoadCapacitiesList = planes.stream().map(Plane::getMaxLoadCapacity).collect(Collectors.toList());
        for (int i = 0; i < maxLoadCapacitiesList.size() - 1; i++) {
            if(maxLoadCapacitiesList.get(i + 1) < maxLoadCapacitiesList.get(i)){
                return false;
            }
        }
        return true;
    }

    public boolean hasBomberMilitaryPlane(List<MilitaryPlane> bomberMilitaryPlanes) {
        return bomberMilitaryPlanes.stream().map(MilitaryPlane::getType).anyMatch(planeType -> planeType == MilitaryType.BOMBER);
    }

    public boolean hasUnclassifiedExperimentalPlane(List<ExperimentalPlane> experimentalPlanes) {
        return experimentalPlanes.
                stream()
                .map(ExperimentalPlane::getClassificationLevel)
                .anyMatch(classificationLevel -> classificationLevel == ClassificationLevel.UNCLASSIFIED);
    }

}
