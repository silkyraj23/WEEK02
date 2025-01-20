class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    
    // Constructor
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to demonstrate access to ISBN and title
    public void displayBookDetails() {
        // Accessing public ISBN (direct access)
        System.out.println("ISBN: " + ISBN);
        
        // Accessing protected title (direct access)
        System.out.println("Title: " + title);
        
        // Accessing private author through getter
        System.out.println("Author: " + getAuthor());
    }
}

public class LibraryBookSystem {
    public static void main(String[] args) {
        // Creating an EBook object
        EBook ebook = new EBook("123-4567890123", "Java Programming", "Sadhguru");

        // Displaying book details
        ebook.displayBookDetails();

        // Accessing public ISBN directly
        System.out.println("Accessing public ISBN directly: " + ebook.ISBN);

        // Cannot access private author directly, must use getter
        // System.out.println(ebook.author); // This would result in a compilation error

        // Accessing and modifying private author through setter
        ebook.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
