package ex9;

public class CommandPatternTest {
 public static void main(String[] args) {
     Lamp lamp = new Lamp();
     Command turnOn = new TurnOnLightCommand(lamp);
     Command turnOff = new TurnOffLightCommand(lamp);
     RemoteControl remoteControl = new RemoteControl();
     remoteControl.setCommand(turnOn);
     remoteControl.pressButton();
     remoteControl.setCommand(turnOff);
     remoteControl.pressButton();
 }
}