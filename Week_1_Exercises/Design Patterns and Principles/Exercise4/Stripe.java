package adapterpattern;

/**
 * Represents the Stripe payment system.
 */
public class Stripe {
    /**
     * Makes a payment of the given amount through Stripe.
     *
     * @param amount the amount to pay
     */
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}