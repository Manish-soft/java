 class Book {
    String title;
    String author;
    boolean issued;

    static int totalIssuedBooks = 0;

   
    Book(String title, String author, boolean issued) {
        this.title = title;
        this.author = author;
        this.issued = issued;

        if (issued) {
            totalIssuedBooks++;
        }
    }

  
    boolean isIssued() {
        return issued;
    }


    static void showTotalIssued() {
        System.out.println("Total books issued: " + totalIssuedBooks);
 
}

}
 class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", true);
        Book book2 = new Book("Five Point Someone", "Chetan Bhagat", false);
        Book book3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);

        System.out.println("Book1 issued? " + book1.isIssued());
        System.out.println("Book2 issued? " + book2.isIssued());
        System.out.println("Book3 issued? " + book3.isIssued());

        Book.showTotalIssued();
    }






















}

