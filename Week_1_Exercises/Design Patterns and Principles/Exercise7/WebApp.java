// WebApp.java
package main;

/**
 * A web application that observes stock price changes.
 */
class WebApp implements StockPriceObserver {
    private String appName;

    /**
     * Creates a new web application with a given name.
     * 
     * @param appName the name of the web application
     */
    public WebApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void updateStockPrice(double currentStockPrice) {
        System.out.println(appName + " received stock price update: $" + currentStockPrice);
    }
}