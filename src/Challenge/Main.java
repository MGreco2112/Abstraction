package Challenge;

public class Main {


    public static void main(String[] args) {
        /*
        Challenge for Abstract Classes and Methods:

        Create a program focusing on Vehicles
        Required Classes: Vehicle, Engine
        Each Vehicle Class should contain one Engine
        Each Vehicle Class should contain methods to:
            Start/Stop
            Add Passengers
            Remove Passengers

        Basic Requirements:
        At least one Abstract Class
        At least two Abstract Methods
         */

        Passenger matt = new Passenger("Matt", 130);
        Passenger kevin = new Passenger("Kevin", 190);
        Passenger corrine = new Passenger("Corrine", 200);

        Car delorean = new Car(new ElectricEngine(), 2);
        Plane boeing747 = new Plane(new GasEngine(), 200);
        Boat speedboat = new Boat(new ElectricEngine(), 2, 500);

        delorean.addPassenger(matt);
        delorean.toggleEngine();
        delorean.toggleEngine();
        delorean.removePassenger(matt);

        boeing747.addPassenger(corrine);
        boeing747.toggleEngine();
        boeing747.toggleLandingGear();
        boeing747.toggleLandingGear();
        boeing747.toggleEngine();
        boeing747.removePassenger(corrine);

        speedboat.addPassenger(kevin);
        speedboat.toggleEngine();
        speedboat.toggleEngine();
        speedboat.removePassenger(kevin);
    }
}
