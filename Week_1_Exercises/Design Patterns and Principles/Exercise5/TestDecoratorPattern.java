package jse;

public class TestDecoratorPattern {
    public static void main(String[] args) {
        // Create the base alert
        Alert emailAlert = new EmailAlert();

        // Decorate with SMS alert
        Alert smsAlert = new SMSAlertDecorator(emailAlert);

        // Decorate with Telegram alert
        Alert telegramAlert = new TelegramAlertDecorator(smsAlert);

        // Send alert via all channels
        telegramAlert.send("This is a test alert.");
    }
}