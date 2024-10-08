// src/RealImage.java
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Loading " + filename);
    }

    @Override
    public void renderImage() {
        System.out.println("Displaying " + filename);
    }
}