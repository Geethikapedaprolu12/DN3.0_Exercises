// src/Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        PaymentContext paymentProcessingContext = new PaymentContext();

        System.out.println("Select payment method: ");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        int paymentMethodChoice = userInputScanner.nextInt();
        userInputScanner.nextLine();  // Consume newline left-over

        PaymentStrategy selectedPaymentStrategy = null;

        switch (paymentMethodChoice) {
            case 1:
                // Credit Card Payment
                System.out.print("Enter credit card number: ");
                String creditCardNumber = userInputScanner.nextLine();
                System.out.print("Enter cardholder's name: ");
                String cardholderName = userInputScanner.nextLine();
                selectedPaymentStrategy = new CreditCardPayment(creditCardNumber, cardholderName);
                break;

            case 2:
                // PayPal Payment
                System.out.print("Enter PayPal email: ");
                String paypalEmail = userInputScanner.nextLine();
                selectedPaymentStrategy = new PayPalPayment(paypalEmail);
                break;

            default:
                System.out.println("Invalid choice");
                return;
        }

        paymentProcessingContext.setPaymentStrategy(selectedPaymentStrategy);

        System.out.print("Enter amount to pay: ");
        double paymentAmount = userInputScanner.nextDouble();

        paymentProcessingContext.executePayment(paymentAmount);
    }
}