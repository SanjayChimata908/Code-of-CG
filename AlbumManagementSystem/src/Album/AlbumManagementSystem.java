package Album;

public class AlbumManagementSystem {

	public static void main(String[] args) {

		AlbumManagement management = new AlbumManagement();

		management.addAlbum(new Album("Thriller", "Michael Jackson", 2025, 9));
		management.addAlbum(new Album("Pushpa", "AA", 2024, 10));
		management.addAlbum(new Album("Game Changer", "Ram", 2023, 10));
		management.addAlbum(new Album("Daku", "BB", 2022, 17));

		// Display albums
		System.out.println("Original List:");
		management.displayAlbums();

		// Sort by title
		System.out.println("\nSorted by Title:");
		management.sortAlbums(new AlbumComparator.CompareByTitle());
		management.displayAlbums();

		// Sort by artist
		System.out.println("\nSorted by Artist:");
		management.sortAlbums(new AlbumComparator.CompareByArtist());
		management.displayAlbums();

		// Sort by release year
		System.out.println("\nSorted by Release Year (Descending):");
		management.sortAlbums(new AlbumComparator.CompareByReleaseYear());
		management.displayAlbums();

	}

}
