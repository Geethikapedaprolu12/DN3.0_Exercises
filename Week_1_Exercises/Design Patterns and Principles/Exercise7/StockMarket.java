// StockMarket.java
package main;

import java.util.ArrayList;
import java.util.List;

/**
 * A stock market that notifies observers of stock price changes.
 */
class StockMarket implements Stock {
    private List<StockPriceObserver> stockPriceObservers;
    private double currentStockPrice;

    /**
     * Creates a new stock market.
     */
    public StockMarket() {
        stockPriceObservers = new ArrayList<>();
    }

    /**
     * Sets the current stock price and notifies all observers.
     * 
     * @param newStockPrice the new stock price
     */
    public void setStockPrice(double newStockPrice) {
        this.currentStockPrice = newStockPrice;
        notifyObservers();
    }

    /**
     * Gets the current stock price.
     * 
     * @return the current stock price
     */
    public double getCurrentStockPrice() {
        return currentStockPrice;
    }

    @Override
    public void registerObserver(StockPriceObserver observer) {
        stockPriceObservers.add(observer);
    }

    @Override
    public void deregisterObserver(StockPriceObserver observer) {
        stockPriceObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (StockPriceObserver observer : stockPriceObservers) {
            observer.updateStockPrice(currentStockPrice);
        }
    }
}