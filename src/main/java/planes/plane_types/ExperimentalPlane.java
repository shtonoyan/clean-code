package planes.plane_types;

import models.ClassificationLevel;
import models.ExperimentalTypes;
import planes.Plane;

public abstract class ExperimentalPlane extends Plane {

    protected ExperimentalTypes experimentalTypes;
    protected ClassificationLevel classificationLevel;

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + modelName + '\'' +
                '}';
    }
}
