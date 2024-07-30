package adapterpattern;

/**
 * Interface for payment processors.
 */
public interface PaymentProcessor {
    /**
     * Processes a payment of the given amount.
     *
     * @param amount the amount to pay
     */
    void processPayment(double amount);
}