import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchDemo {
    public static void main(String[] args) {
        List<Product> itemList = new ArrayList<>();
        itemList.add(new Product(1, "Laptop", "Electronics"));
        itemList.add(new Product(2, "Shoes", "Apparel"));
        itemList.add(new Product(3, "Watch", "Accessories"));
        itemList.add(new Product(4, "Smartphone", "Electronics"));
        itemList.add(new Product(5, "Backpack", "Accessories"));

        // Linear search
        LinearSearch linearSearch = new LinearSearch();
        Product linearResult = linearSearch.linearSearch(itemList, "Backpack");
        System.out.println("Linear Search Result: " + linearResult);

        // Sort items by name for binary search
        Collections.sort(itemList, (p1, p2) -> p1.getName().compareTo(p2.getName()));

        // Binary search
        BinarySearch binarySearch = new BinarySearch();
        Product binaryResult = binarySearch.binarySearch(itemList, "Backpack");
        System.out.println("Binary Search Result: " + binaryResult);
    }
}