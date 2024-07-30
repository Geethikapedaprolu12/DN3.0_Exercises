// Stock.java
package main;

import java.util.ArrayList;
import java.util.List;

/**
 * A stock that can be observed by stock price observers.
 */
interface Stock {
    /**
     * Registers a stock price observer to receive updates.
     * 
     * @param observer the stock price observer to register
     */
    void registerStockPriceObserver(StockPriceObserver observer);

    /**
     * Deregisters a stock price observer to stop receiving updates.
     * 
     * @param observer the stock price observer to deregister
     */
    void deregisterStockPriceObserver(StockPriceObserver observer);

    /**
     * Notifies all registered stock price observers of a stock price change.
     */
    void notifyStockPriceObservers();
}