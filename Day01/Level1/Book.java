public class Book {
    //Create attributes of Book
    String title;
    String author;
    int price;

    //Create a constructor to initialize the attributes
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Display details of Book
    void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    //main method
    public static void main(String[] args) {
        //Create an object of the Book class
        Book book = new Book("The god of small things", "Arundhati Roy", 500);
        book.displayDetails();

    }
}

