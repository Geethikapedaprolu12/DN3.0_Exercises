// src/ProxyPatternDemo.java
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // Image will be loaded from disk
        image.renderImage();
        System.out.println("");

        // Image will not be loaded from disk
        image.renderImage();
    }
}