// Observer.java
package main;

/**
 * Interface for observers to receive updates from the subject.
 */
interface StockPriceObserver {
    /**
     * Updates the observer with the new stock price.
     * 
     * @param newStockPrice the new stock price
     */
    void updateStockPrice(double newStockPrice);
}