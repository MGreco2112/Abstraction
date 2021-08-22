package Challenge;

public class Plane extends Vehicle{
    public boolean isLanding = true;

    public Plane(Engine engine, int maxLoad) {
        this.type = "Plane";
        this.engine = engine;
        this.maxLoad = maxLoad;
        this.isAir = true;
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < maxLoad) {
            System.out.println(passenger.name + " has boarded the plane");
            passengers.add(passenger);
        } else {
            System.out.println("The plane is full");
        }
    }

    public void removePassenger(Passenger passenger) {
        if (passengers.contains(passenger)) {
            System.out.println(passenger.name + " has disembarked");
            passengers.remove(passenger);
        } else {
            System.out.println(passenger.name + " is not on board");
        }
    }

    public void toggleLandingGear() {
        if (isLanding) {
            System.out.println("Plane is taking off");
            isLanding = false;
        } else {
            System.out.println("Plane is now landing");
            isLanding = true;
        }
    }
}
