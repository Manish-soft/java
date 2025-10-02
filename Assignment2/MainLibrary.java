 class Book {
     int bookId;
     String title;
     String author;

     Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

  
     int getBookId() {
        return bookId;
    }

     void setBookId(int bookId) {
        this.bookId = bookId;
    }

     String getTitle() {
        return title;
    }

     void setTitle(String title) {
        this.title = title;
    }

     String getAuthor() {
        return author;
    }

     void setAuthor(String author) {
        this.author = author;
    }
}
 class Library {
     String libraryName;
     static int totalBooks = 0;

    // Constructor
     Library(String libraryName) {
        this.libraryName = libraryName;
    }

    // Method to add book
     void addBook(Book b) {
        totalBooks++;
        System.out.println("Book added: " + b.getTitle());
    }

    // Method to display total books
     void displayTotalBooks() {
        System.out.println("Total books in library: " + totalBooks);
    }
}
 class MainLibrary {
    public static void main(String[] args) {
        Library lib = new Library("City Library");

        Book book1 = new Book(101, "The Alchemist", "Paulo Coelho");
        Book book2 = new Book(102, "1984", "George Orwell");

        lib.addBook(book1);
        lib.addBook(book2);

        lib.displayTotalBooks();
    }
}
