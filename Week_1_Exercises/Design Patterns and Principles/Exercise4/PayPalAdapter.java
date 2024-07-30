package adapterpattern;

public class OnlinePaymentAdapter implements PaymentGateway {
    private OnlinePayment onlinePayment;

    public OnlinePaymentAdapter(OnlinePayment onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    @Override
    public void makePayment(double amount) {
        onlinePayment.makeOnlinePayment(amount);
    }
}