package Challenge;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    public String type;
    public Engine engine;
    public int maxLoad;
    public boolean isLand = false;
    public boolean isAir = false;
    public boolean isWater = false;
    public List<Passenger> passengers = new ArrayList<>();

    public void toggleEngine() {
        if (!engine.isOn) {
            engine.turnOn();
        } else {
            engine.turnOff();
        }
    }

    public abstract void addPassenger(Passenger passenger);

    public abstract void removePassenger(Passenger passenger);


}
