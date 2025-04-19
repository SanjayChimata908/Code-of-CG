package library;

public class LibraryManagementSystem {
	
 public static void main(String[] args) {
    Library library = new Library();

    // Adding books
    library.addBook(new Book("1", "Java Programming", "Author A", "Education", 5));
    library.addBook(new Book("2", "Python Programming", "Author B", "Education", 3));

    // Adding members
    library.addMember(new Member("M1", "Sanjay", "1234567890"));
    library.addMember(new Member("M2", "Sandeep", "0987654321"));

    // Displaying books and members
    System.out.println("Books in Library:");
    library.displayBooks();

    System.out.println("\nLibrary Members:");
    library.displayMembers();

    // Borrowing a book
    System.out.println("\nBorrowing a book:");
    library.borrowBook("M1", "1");
    library.displayBooks();

    // Returning a book
    System.out.println("\nReturning a book:");
    library.returnBook("M1", "1");
    library.displayBooks();

    // Searching for a book
    System.out.println("\nSearching for a book:");
    Book foundBook = library.searchBook("Python Programming");
    if (foundBook != null) {
        System.out.println("Found: " + foundBook.getTitle());
    } else {
        System.out.println("Book not found.");
    }

    // Searching for a member
    System.out.println("\nSearching for a member:");
    Member foundMember = library.searchMember("Jane Smith");
    if (foundMember != null) {
        System.out.println("Found: " + foundMember.getName());
    } else {
        System.out.println("Member not found.");
    }
  }
}
