// ObserverPatternTest.java
package main;

import java.util.Scanner;

/**
 * Test class for the Observer pattern.
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create a stock market instance
        StockMarket stockMarket = new StockMarket();

        // Create mobile and web app instances
        MobileApplication mobileApplication1 = new MobileApplication("MobileApplication1");
        MobileApplication mobileApplication2 = new MobileApplication("MobileApplication2");
        WebApplication webApplication1 = new WebApplication("WebApplication1");

        // Register observers with the stock market
        stockMarket.registerObserver(mobileApplication1);
        stockMarket.registerObserver(mobileApplication2);
        stockMarket.registerObserver(webApplication1);

        // Create a scanner to read user input
        Scanner userInputScanner = new Scanner(System.in);
        while (true) {
            // Prompt user to enter new stock price
            System.out.println("Enter new stock price (or type 'exit' to quit): ");
            String userInput = userInputScanner.nextLine();

            // Check if user wants to exit
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                // Parse user input to a double value
                double newStockPrice = Double.parseDouble(userInput);
                stockMarket.setStockPrice(newStockPrice);
            } catch (NumberFormatException e) {
                // Handle invalid input
                System.out.println("Please enter a valid number.");
            }
        }
        // Close the scanner
        userInputScanner.close();
    }
}