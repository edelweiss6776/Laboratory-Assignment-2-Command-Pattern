public class onCommand implements Command {
  private Device device;

  public onCommand(Device device){
    this.device = device;
  }

@Override
public void execute() {

  device.turnon()
}

}
