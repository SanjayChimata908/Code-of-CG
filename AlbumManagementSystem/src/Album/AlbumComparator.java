package Album;

import java.util.Comparator;

public class AlbumComparator {
	  // Compares albums by title
    public static class CompareByTitle implements Comparator<Album> {
        public int compare(Album a1, Album a2) {
            return a1.getTitle().compareToIgnoreCase(a2.getTitle());
        }
    }

    // Compares albums by artist
    public static class CompareByArtist implements Comparator<Album> {
        public int compare(Album a1, Album a2) {
            return a1.getArtist().compareToIgnoreCase(a2.getArtist());
        }
    }

    // Compares albums by release year in descending order
    public static class CompareByReleaseYear implements Comparator<Album> {
        public int compare(Album a1, Album a2) {
            return Integer.compare(a2.getReleaseYear(), a1.getReleaseYear());
        }
    }

}
