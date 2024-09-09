public interface PowerUsage {
    double getPowerConsumption();
}

public class PowerMonitor {
    private List<PowerUsage> devices;

    public void addDevice(PowerUsage device) {
        devices.add(device);
    }

    public double getTotalPowerUsage() {
        return devices.stream().mapToDouble(PowerUsage::getPowerConsumption).sum();
    }
}
