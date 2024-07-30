package jse;

public class TelegramNotifierDecorator extends NotifierDecorator {
    public TelegramNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notifyUser(String notification) {
        super.notifyUser(notification);
        sendTelegramNotification(notification);
    }

    private void sendTelegramNotification(String notification) {
        System.out.println("Sending Telegram notification with notification: " + notification);
    }
}