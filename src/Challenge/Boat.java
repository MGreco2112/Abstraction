package Challenge;

public class Boat extends Vehicle{
    public double maxLoadWeight;
    public double totalWeight = 0;

    public Boat(Engine engine, int maxLoad, double maxLoadWeight) {
        this.type = "Boat";
        this.engine = engine;
        this.isWater = true;
        this.maxLoad = maxLoad;
        this.maxLoadWeight = maxLoadWeight;
    }


    public void addPassenger(Passenger passenger) {
        if (passengers.size() < maxLoad && totalWeight + passenger.weight <= maxLoadWeight) {
            passengers.add(passenger);
            System.out.println("Added " + passenger.name);
            totalWeight += passenger.weight;

        } else {
            System.out.println("Boat is full");
        }
    }

    public void removePassenger(Passenger passenger) {
        if (passengers.contains(passenger)) {
            passengers.remove(passenger);
            totalWeight -= passenger.weight;
            System.out.println(passenger.name + " has left the boat");

        } else {
            System.out.println(passenger.name + " is not in Boat");
        }
    }
}
