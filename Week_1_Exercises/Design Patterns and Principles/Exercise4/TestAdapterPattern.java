package adapterpattern;

public class TestAdapterPattern {
    public static void main(String[] args) {
        // Using online payment system through the adapter
        OnlinePaymentSystem onlinePaymentSystem = new OnlinePaymentSystem();
        PaymentGateway onlinePaymentGateway = new OnlinePaymentAdapter(onlinePaymentSystem);
        onlinePaymentGateway.makePayment(100.00);

        // Using bank transfer system through the adapter
        BankTransferSystem bankTransferSystem = new BankTransferSystem();
        PaymentGateway bankTransferGateway = new BankTransferAdapter(bankTransferSystem);
        bankTransferGateway.makePayment(200.00);

        // Using cash payment system through the adapter
        CashPaymentSystem cashPaymentSystem = new CashPaymentSystem();
        PaymentGateway cashPaymentGateway = new CashPaymentAdapter(cashPaymentSystem);
        cashPaymentGateway.makePayment(300.00);
    }
}