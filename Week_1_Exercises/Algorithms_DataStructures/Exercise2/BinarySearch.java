import java.util.List;

public class BinarySearch {
    public Product binarySearch(List<Product> items, String target) {
        int startIndex = 0;
        int endIndex = items.size() - 1;

        while (startIndex <= endIndex) {
            int midpoint = (startIndex + endIndex) / 2;
            Product midItem = items.get(midpoint);
            int comparison = midItem.getName().compareTo(target);

            if (comparison == 0) {
                return midItem;
            } else if (comparison < 0) {
                startIndex = midpoint + 1;
            } else {
                endIndex = midpoint - 1;
            }
        }

        return null;
    }
}