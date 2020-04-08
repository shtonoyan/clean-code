import planes.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import planes.plane_types.ExperimentalPlane;
import planes.plane_types.plane_models.experimental_plane_models.BellX14;
import planes.plane_types.plane_models.experimental_plane_models.RyanX13Vertijet;
import planes.plane_types.plane_models.militaryp_plane_models.*;
import planes.plane_types.plane_models.passenger_plane_models.*;
import planes.plane_types.PassengerPlane;
import java.util.Arrays;
import java.util.List;


public class AirportTest {
    private static List<Plane> planes = Arrays.asList(
            new Boeing737(),
            new Boeing737800(),
            new Boeing747(),
            new AirbusA320(),
            new AirbusA330(),
            new Embraer(),
            new SukhoySuperJet100(),
            new BombardierCS300(),
            new B1BLancer(),
            new B2Spirit(),
            new B52Stratofortress(),
            new F15(),
            new F22(),
            new C130Hercules(),
            new BellX14(),
            new RyanX13Vertijet()
    );

    private static PassengerPlane planeWithMaxPassengerCapacity = new Boeing747();
    Airport airport = new Airport(planes);
    TestHelper testHelper = new TestHelper();

    @Test
    public void testGetTransportMilitaryPlanes() {
        Assert.assertTrue(testHelper.isListContainsTransportOnly(airport.getTransportMilitaryPlanes()));
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        Assert.assertEquals(airport.getPassengerPlaneWithMaxPassengersCapacity(), planeWithMaxPassengerCapacity);
    }

    @Test
    public void testPlaneSortedByMaxLoadCapacity() {
        Assert.assertTrue(testHelper.isListSortedByMaxLoadCapacity(airport.sortByMaxLoadCapacity().getPlanes()));
    }

    @Test
    public void testHasAtLeastOneBomberInMilitaryPlanes() {
        Assert.assertTrue(testHelper.hasBomberMilitaryPlane(airport.getBomberMilitaryPlanes()));
    }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified() {
        Assert.assertFalse(testHelper.hasUnclassifiedExperimentalPlane(airport.getExperimentalPlanes()));
    }
}
