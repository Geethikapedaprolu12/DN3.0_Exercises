package jse;

public class SmsAlert implements Alert {
    @Override
    public void sendMessage(String text) {
        System.out.println("Sending SMS with text: " + text);
    }
}