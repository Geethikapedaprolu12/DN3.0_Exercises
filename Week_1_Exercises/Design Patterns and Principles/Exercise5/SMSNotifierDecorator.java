package jse;

public class SMSAlertDecorator extends AlertDispatcher {
    public SMSAlertDecorator(Alert alert) {
        super(alert);
    }

    @Override
    public void dispatch(String alertMessage) {
        super.dispatch(alertMessage);
        sendSMS(alertMessage);
    }

    private void sendSMS(String alertMessage) {
        System.out.println("Sending SMS with message: " + alertMessage);
    }
}