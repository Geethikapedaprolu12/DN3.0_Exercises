package adapterpattern;

/**
 * Adapter class that adapts the Stripe payment system to the PaymentProcessor interface.
 */
public class StripeAdapter implements PaymentProcessor {
    private Stripe stripe;

    /**
     * Constructs a new StripeAdapter instance with the given Stripe object.
     *
     * @param stripe the Stripe object to adapt
     */
    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    /**
     * Processes a payment of the given amount using the Stripe payment system.
     *
     * @param amount the amount to pay
     */
    @Override
    public void processPayment(double amount) {
        stripe.makePayment(amount);
    }
}
