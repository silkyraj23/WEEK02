class Book{
    String title;
    int publicationYear;
    //constructor
    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    //method to display book details
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Publication Year: "+publicationYear);
    }
    //method to check if the book is old    
    boolean isOld(){
        if(publicationYear<2000){
            return true;
        }
        else{
            return false;
        }
    }
    //method to check if the book is new
    boolean isNew(){
        if(publicationYear>2010){
            return true;
        }
        else{
            return false;
        }
    }

}
//single level inheritance 
class Author extends Book{
    String authorName;
    String bio;
    //constructor
    Author(String title,int publicationYear,String authorName,String bio){
        super(title,publicationYear);
        this.authorName=authorName;
        this.bio=bio;
    }
    //method to display author details
    void display(){
        super.display();
        System.out.println("Author: "+authorName);
        System.out.println("Bio: "+bio);
    }

}
public class Main{
    public static void main(String[] args){
        //creating the instance of the Author class
        Author author=new Author("Java Programming",1988,"Paulo Coelho","Paulo Coelho is a Brazilian lyricist and novelist.");
        author.display();
        if(author.isOld()){
            System.out.println("The book is old");
        }
        else if(author.isNew()){
            System.out.println("The book is new");
        }
        else{
            System.out.println("The book is neither old nor new");
        }
    }

}