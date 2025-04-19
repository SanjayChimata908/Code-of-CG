package library;

import java.util.ArrayList;
import java.util.List;

public class Member {
	
	 private String memberId;
	 private String name;
	 private String phoneNumber;
	 private List<Book> booksBorrowed;
	 
	public Member(String memberId, String name, String phoneNumber) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.booksBorrowed = new ArrayList<>();
	}

	public String getMemberId() {
		return memberId;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public List<Book> getBooksBorrowed() {
		return booksBorrowed;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setBooksBorrowed(List<Book> booksBorrowed) {
		this.booksBorrowed = booksBorrowed;
	}
	
	 public void addBook(Book book) {
	        if (book.getQuantityAvailable() > 0) {
	            booksBorrowed.add(book);
	            book.setQuantityAvailable(book.getQuantityAvailable() - 1);
	        } else {
	            System.out.println("Book not available for borrowing.");
	        }
	    }

	    public void removeBook(Book book) {
	        if (booksBorrowed.remove(book)) {
	            book.setQuantityAvailable(book.getQuantityAvailable() + 1);
	        } else {
	            System.out.println("Book not found in borrowed list.");
	        }
	    }

}
