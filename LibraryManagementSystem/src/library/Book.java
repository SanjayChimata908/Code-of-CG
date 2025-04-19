package library;

public class Book {

    private String bookId;
    private String title;
    private String author;
    private String genre;
    private int quantityAvailable;
	public Book(String bookId, String title, String author, String genre, int quantityAvailable) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.quantityAvailable = quantityAvailable;
	}
	public String getBookId() {
		return bookId;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre() {
		return genre;
	}
	public int getQuantityAvailable() {
		return quantityAvailable;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
    
}
