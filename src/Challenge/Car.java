package Challenge;

public class Car extends Vehicle{

    public Car(Engine engine, int maxLoad) {
        this.type = "Car";
        this.engine = engine;
        this.maxLoad = maxLoad;
        this.isLand = true;
    }


    public void addPassenger(Passenger passenger) {
        if (passengers.size() < maxLoad) {
            passengers.add(passenger);
            System.out.println("Added " + passenger.name + " to the Car");

        } else {
            System.out.println("Car is full");
        }
    }

    public void removePassenger(Passenger passenger) {
        if (passengers.contains(passenger)) {
            passengers.remove(passenger);
            System.out.println(passenger.name + " has left the car");

        } else {
            System.out.println(passenger.name + " is not in Car");
        }
    }


}
