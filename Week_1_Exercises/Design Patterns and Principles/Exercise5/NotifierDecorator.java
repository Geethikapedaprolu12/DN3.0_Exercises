package jse;

public abstract class AlertDispatcher implements Alert {
    protected Alert wrappedAlert;

    public AlertDispatcher(Alert alert) {
        this.wrappedAlert = alert;
    }

    @Override
    public void dispatch(String alertMessage) {
        wrappedAlert.dispatch(alertMessage);
    }
}