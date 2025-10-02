class Book {
    // Instance variables
    String title;
    String author;
    boolean issued;

    // Static variable to keep track of total issued books
    static int totalIssuedBooks = 0;

    // Constructor to initialize book details
    Book(String title, String author, boolean issued) {
        this.title = title;  // Assigning the parameter to the instance variable
        this.author = author;
        this.issued = issued;

        if (this.issued) {
            totalIssuedBooks++;  // Increment the count if the book is issued
        }
    }

    // Getter for title
    String getTitle() {
        return title;
    }

    // Setter for title
    void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    String getAuthor() {
        return author;
    }

    // Setter for author
    void setAuthor(String author) {
        this.author = author;
    }

    // Getter for issued status
    boolean isIssued() {
        return issued;
    }

    // Setter for issued status
    void setIssued(boolean issued) {
        this.issued = issued;
        if (issued) {
            totalIssuedBooks++;  // Increase if the book is issued
        } else {
            totalIssuedBooks--;  // Decrease if the book is returned
        }
    }

    // Static method to display total issued books
    static void showTotalIssued() {
        System.out.println("Total books issued: " + totalIssuedBooks);
    }
}

public class Mainbook {

    public static void main(String[] args) {
        
        Book b1 = new Book("Harry Potter", "J.K. Rowling", true);
        Book b2 = new Book("Five Point Someone", "Chetan Bhagat", false);
        Book b3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);


        System.out.println("Book1 is issued: " + b1.isIssued());  // true
        System.out.println("Book2 is issued: " + b2.isIssued());  // false
        System.out.println("Book3 is issued: " + b3.isIssued());  // true

        Book.showTotalIssued();  
    }
}

