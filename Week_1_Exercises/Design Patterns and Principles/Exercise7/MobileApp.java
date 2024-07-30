// MobileApplication.java
package main;

/**
 * A mobile application that observes stock price updates.
 */
class MobileApplication implements StockPriceObserver {
    private String applicationName;

    /**
     * Creates a new mobile application with the given name.
     * 
     * @param applicationName the name of the mobile application
     */
    public MobileApplication(String applicationName) {
        this.applicationName = applicationName;
    }

    @Override
    public void updateStockPrice(double newStockPrice) {
        System.out.println(applicationName + " received stock price update: $" + newStockPrice);
    }
}