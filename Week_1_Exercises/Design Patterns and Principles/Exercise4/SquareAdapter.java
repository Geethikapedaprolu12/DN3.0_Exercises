package adapterpattern;

public class CashPaymentAdapter implements PaymentGateway {
    private CashPaymentSystem cashPaymentSystem;

    public CashPaymentAdapter(CashPaymentSystem cashPaymentSystem) {
        this.cashPaymentSystem = cashPaymentSystem;
    }

    @Override
    public void makePayment(double amount) {
        cashPaymentSystem.payInCash(amount);
    }
}