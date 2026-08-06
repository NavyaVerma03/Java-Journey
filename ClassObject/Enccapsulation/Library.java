// Create a Book class using encapsulation with private variables, getter and setter methods, and implement issueBook() and returnBook() methods to manage book availability.
package ClassObject.Enccapsulation;
import java.util.Scanner;

class Book {

    // Private data members
    private int bookId;
    private String title;
    private String author;
    private boolean available;

    // Setter methods
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Getter methods
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getAvailable() {
        return available;
    }

    // Issue Book
    public void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book Issued Successfully.");
        } else {
            System.out.println("Book is Already Issued.");
        }
    }

    // Return Book
    public void returnBook() {
        available = true;
        System.out.println("Book Returned Successfully.");
    }
}

public class Library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b = new Book();

        System.out.print("Enter Book ID: ");
        b.setBookId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        b.setTitle(sc.nextLine());

        System.out.print("Enter Author Name: ");
        b.setAuthor(sc.nextLine());

        b.setAvailable(true);

        b.issueBook();
        b.returnBook();

        System.out.println("\nBook Details");
        System.out.println("Book ID: " + b.getBookId());
        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Available: " + b.getAvailable());

        sc.close();
    }
}

