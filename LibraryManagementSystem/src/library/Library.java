package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books;
    private List<Member> members;
    
	public Library() {
		super();
		this.books = new ArrayList<>();
		this.members = new ArrayList<>();
	}
	public List<Book> getBooks() {
		return books;
	}
	public List<Member> getMembers() {
		return members;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public void setMembers(List<Member> members) {
		this.members = members;
	}
	
    // Methods to manage Books
    public void addBook(Book book) {
    	books.add(book);
    	
    }
    public void displayBooks() {
        for (Book book : books) {
            System.out.println("ID: " + book.getBookId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Genre: " + book.getGenre() + ", Available: " + book.getQuantityAvailable());
        }
    }
    public Book searchBook(String keyword) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(keyword) || book.getAuthor().equalsIgnoreCase(keyword)) {
                return book;
            }
        }
        return null;
    }
    
    //Methods to manage members
    public void addMember(Member member) {
        members.add(member);
    }

    public void displayMembers() {
        for (Member member : members) {
            System.out.println("ID: " + member.getMemberId() + ", Name: " + member.getName() + ", Phone: " + member.getPhoneNumber());
        }
    }

    public Member searchMember(String keyword) {
        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(keyword) || member.getPhoneNumber().equals(keyword)) {
                return member;
            }
        }
        return null;
    }

    //Methods to Borrow and return books
    public void borrowBook(String memberId, String bookId) {
        Member member = null;
        Book book = null;

        for (Member m : members) {
            if (m.getMemberId().equals(memberId)) {
                member = m;
                break;
            }
        }

        for (Book b : books) {
            if (b.getBookId().equals(bookId)) {
                book = b;
                break;
            }
        }

        if (member != null && book != null) {
            member.addBook(book);
        } else {
            System.out.println("Member or book not found.");
        }
    }

    public void returnBook(String memberId, String bookId) {
        Member member = null;
        Book book = null;

        for (Member m : members) {
            if (m.getMemberId().equals(memberId)) {
                member = m;
                break;
            }
        }

        for (Book b : books) {
            if (b.getBookId().equals(bookId)) {
                book = b;
                break;
            }
        }

        if (member != null && book != null) {
            member.removeBook(book);
        } else {
            System.out.println("Member or book not found.");
        }
    }


}
