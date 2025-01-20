public class Book {
    
    //define attributes 
    public static String libraryName = "This is Library name";
    public String title;
    public String author;
    public final String isbn;

    //create constructor
    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //method to display library name
    static void displayLibraryName(){
        System.out.println(libraryName);
    }


    //method to print book details
    void displayBookDetails(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(isbn);
    }

    public static void main(String[] args) {

        //create object of Book class
        Book book1 = new Book("Java", "Author1", "1234");
        Book book2 = new Book("Python", "Author2", "5678");

        // Verify if an object is an instance of the Book class before displaying its details.
        if(book1 instanceof Book){
            book1.displayBookDetails();
        }
        if(book2 instanceof Book){
            book2.displayBookDetails();
        }

        //call method to display library name 
        Book.displayLibraryName();

    }
}