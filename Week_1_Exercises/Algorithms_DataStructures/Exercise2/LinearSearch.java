import java.util.List;

public class LinearSearch {
    public Product linearSearch(List<Product> items, String target) {
        for (Product item : items) {
            if (item.getName().equals(target)) {
                return item;
            }
        }
        return null;
    }
}