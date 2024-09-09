public interface Device {
    void turnOn();
    void turnOff();
}

public class Light implements Device {
    @Override
    public void turnOn() {
        System.out.println("Lights are turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights are turned off.");
    }
}

public class Thermostat implements Device {
    @Override
    public void turnOn() {
        System.out.println("Thermostat is now set to heating mode.");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is turned off.");
    }
}
