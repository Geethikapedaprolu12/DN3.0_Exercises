package libraryMangementSystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Publication {
    private int publicationId;
    private String publicationTitle;
    private String publicationAuthor;

    public Publication(int publicationId, String publicationTitle, String publicationAuthor) {
        this.publicationId = publicationId;
        this.publicationTitle = publicationTitle;
        this.publicationAuthor = publicationAuthor;
    }

    public int getPublicationId() {
        return publicationId;
    }

    public String getPublicationTitle() {
        return publicationTitle;
    }

    public String getPublicationAuthor() {
        return publicationAuthor;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "publicationId=" + publicationId +
                ", publicationTitle='" + publicationTitle + '\'' +
                ", publicationAuthor='" + publicationAuthor + '\'' +
                '}';
    }
}

class SearchUtils {
    // Linear search method
    public static List<Publication> linearSearch(List<Publication> publications, String publicationTitle) {
        List<Publication> results = new ArrayList<>();
        for (Publication publication : publications) {
            if (publication.getPublicationTitle().equalsIgnoreCase(publicationTitle)) {
                results.add(publication);
            }
        }
        return results;
    }

    // Binary search method
    public static Publication binarySearch(List<Publication> publications, String publicationTitle) {
        int low = 0;
        int high = publications.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midTitle = publications.get(mid).getPublicationTitle().toLowerCase();

            if (midTitle.equals(publicationTitle.toLowerCase())) {
                return publications.get(mid);
            } else if (midTitle.compareTo(publicationTitle.toLowerCase()) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; 
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<Publication> publications = new ArrayList<>();
        publications.add(new Publication(1, "It Starts with Us", "Colleen Hoover"));
        publications.add(new Publication(2, "Girl in Room 105", "Chetan Bhagat"));
        publications.add(new Publication(3, "It Ends with Us", "Colleen Hoover"));
        String titleToSearch = "Girl in Room 105";
        List<Publication> foundPublicationsLinear = SearchUtils.linearSearch(publications, titleToSearch);
        System.out.println("Linear Search Results: " + foundPublicationsLinear);
        publications.sort(Comparator.comparing(Publication::getPublicationTitle, String.CASE_INSENSITIVE_ORDER));
        Publication foundPublicationBinary = SearchUtils.binarySearch(publications, titleToSearch);
        System.out.println("Binary Search Result: " + foundPublicationBinary);
    }
}