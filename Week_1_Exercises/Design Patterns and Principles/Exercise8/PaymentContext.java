// src/PaymentContext.java
public class PaymentContext {
    private PaymentStrategy selectedPaymentMethod;

    public void setPaymentStrategy(PaymentStrategy selectedPaymentMethod) {
        this.selectedPaymentMethod = selectedPaymentMethod;
    }

    public void executePayment(double paymentAmount) {
        selectedPaymentMethod.pay(paymentAmount);
    }
}