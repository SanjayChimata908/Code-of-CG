package Album;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AlbumManagement {
    private List<Album> albums;

	public AlbumManagement() {
		super();
		this.albums = new ArrayList<>();
	}
    
	public void addAlbum(Album album) {
		albums.add(album);
	}
	
	//Display all albums
	public void displayAlbums() {
		for (Album album:albums) {
			System.out.println(album);
		}
	}
	
	//Sort all albums
	public void sortAlbums(Comparator<Album> comparator) {
		albums.sort(comparator);
	}
    
}
