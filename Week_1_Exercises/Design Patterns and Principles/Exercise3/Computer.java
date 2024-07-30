package jse;

/**
 * Represents a computer with various components.
 */
public class Computer {
    // Attributes of the Computer
    private String centralProcessingUnit;
    private String randomAccessMemory;
    private String storageDevice;
    private String graphicsProcessingUnit;
    private String motherboard;
    private String powerSupplyUnit;

    // Private constructor to enforce the use of Builder
    private Computer(Builder builder) {
        this.centralProcessingUnit = builder.centralProcessingUnit;
        this.randomAccessMemory = builder.randomAccessMemory;
        this.storageDevice = builder.storageDevice;
        this.graphicsProcessingUnit = builder.graphicsProcessingUnit;
        this.motherboard = builder.motherboard;
        this.powerSupplyUnit = builder.powerSupplyUnit;
    }

    // Getters for each attribute
    public String getCentralProcessingUnit() {
        return centralProcessingUnit;
    }

    public String getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public String getStorageDevice() {
        return storageDevice;
    }

    public String getGraphicsProcessingUnit() {
        return graphicsProcessingUnit;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getPowerSupplyUnit() {
        return powerSupplyUnit;
    }

    // Static nested Builder class
    public static class Builder {
        // Attributes for Builder class
        private String centralProcessingUnit;
        private String randomAccessMemory;
        private String storageDevice;
        private String graphicsProcessingUnit;
        private String motherboard;
        private String powerSupplyUnit;

        // Methods to set each attribute
        public Builder setCentralProcessingUnit(String centralProcessingUnit) {
            this.centralProcessingUnit = centralProcessingUnit;
            return this;
        }

        public Builder setRandomAccessMemory(String randomAccessMemory) {
            this.randomAccessMemory = randomAccessMemory;
            return this;
        }

        public Builder setStorageDevice(String storageDevice) {
            this.storageDevice = storageDevice;
            return this;
        }

        public Builder setGraphicsProcessingUnit(String graphicsProcessingUnit) {
            this.graphicsProcessingUnit = graphicsProcessingUnit;
            return this;
        }

        public Builder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Builder setPowerSupplyUnit(String powerSupplyUnit) {
            this.powerSupplyUnit = powerSupplyUnit;
            return this;
        }

        // Build method to return an instance of Computer
        public Computer build() {
            return new Computer(this);
        }
    }
}