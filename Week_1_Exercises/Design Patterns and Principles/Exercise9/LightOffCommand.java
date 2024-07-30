package ex9;

public class TurnOffLightCommand implements Command {
    private Lamp lamp;

    public TurnOffLightCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOff();
    }
}