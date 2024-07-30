package ex9;

public class TurnOnLightCommand implements Command {
    private Lamp lamp;

    public TurnOnLightCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }

    @Override
    public void undo() {
        lamp.turnOff();
    }
}