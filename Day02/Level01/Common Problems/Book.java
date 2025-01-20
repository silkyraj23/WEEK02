public class Book {

    String title;
    String author;
    int price;

    Book(){
        title = "Death : An Inside Story";
        author = "Sadhguru";
        price = 299;
    }

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //method to display details
    public void display() {
        System.out.println("Book 1: " + title + " by " + author + " costs " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Let Us C", "Yashwant Karnekar", 399);
        book1.display();
        book2.display();
    }
}