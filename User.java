public class SmartAutomation {
    public static void main(String[] args) {
        Device light = new Light();
        Device thermostat = new Thermostat();

        Command turnOnLight = new TurnOnCommand(light);
        Command turnOnThermostat = new TurnOnCommand(thermostat);

        RemoteControl remote = new RemoteControl();
        
        
        remote.setCommand(turnOnLight);
        remote.pressButton();

        
        remote.setCommand(turnOnThermostat);
        remote.pressButton();
    }
}
