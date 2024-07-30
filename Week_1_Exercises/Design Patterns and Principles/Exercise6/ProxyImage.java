// src/ProxyImage.java
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void renderImage() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.renderImage();
    }
}