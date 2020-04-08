package planes;

import java.util.Objects;

  public abstract class Plane {
    protected String modelName;
    protected int maxSpeed;
    protected int maxFlightDistance;
    protected int maxLoadCapacity;


    public int getMaximalSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + modelName + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                Objects.equals(modelName, plane.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
