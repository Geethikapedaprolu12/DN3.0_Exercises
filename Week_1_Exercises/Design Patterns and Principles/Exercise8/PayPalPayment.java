// src/PayPalPayment.java
public class PayPalPayment implements PaymentStrategy {
    private String paypalEmail;

    public PayPalPayment(String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }

    @Override
    public void pay(double paymentAmount) {
        System.out.println("Paid $" + paymentAmount + " using PayPal account " + paypalEmail + ".");
    }
}