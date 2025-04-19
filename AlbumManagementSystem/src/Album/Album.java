package Album;

public class Album {
	
	  private String title;
	  private String artist;
	  private int releaseYear;
	  private int numberOfTracks;
 public Album(String title, String artist, int releaseYear, int numberOfTracks) {
	        this.title = title;
	        this.artist = artist;
	        this.releaseYear = releaseYear;
	        this.numberOfTracks = numberOfTracks;
	    }
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public int getNumberOfTracks() {
		return numberOfTracks;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}
	@Override
	public String toString() {
		return "Album [title=" + title + ", artist=" + artist + ", releaseYear=" + releaseYear + ", numberOfTracks="
				+ numberOfTracks + "]";
	}	
	
	 public int compareTo(Album other) {
	        return this.title.compareToIgnoreCase(other.title);
	    }
}