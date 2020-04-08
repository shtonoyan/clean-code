import planes.Plane;
import planes.plane_types.plane_models.militaryp_plane_models.*;
import planes.plane_types.plane_models.passenger_plane_models.*;

import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<Plane> planes = Arrays.asList(
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
            new C130Hercules()
    );

    public static void main(String[] args) {
        Airport airport = new Airport(planes);
        Airport militaryAirport = new Airport(airport.getMilitaryPlanes());
        Airport passengerAirport = new Airport(airport.getPassengerPlane());
        System.out.println("Military airport sorted by max distance: " + militaryAirport
                .sortByMaxDistance()
                .toString());
        System.out.println("Passenger airport sorted by max speed: " + passengerAirport
                .sortByMaxSpeed()
                .toString());

        System.out.println("Plane with max passenger capacity: " + passengerAirport.getPassengerPlaneWithMaxPassengersCapacity());
    }
}
