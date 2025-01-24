class Animal{
    //atributes of animal class
    String name;
    int age;
    //constructor of animal class
    Animal(String name , int age){
        this.name=name;
        this.age=age;
    }
    //method of animal class
    public void makeSound(){
        System.out.println("Animal is making sound");
    }
    public void display(){
        System.out.println("Name of Animal is "+name);
        System.out.println("Age of Animal is "+age);
    }
}
class Dog extends Animal{
    //attribute of Dog class
    String breed;
    int noOfLegs;
    //constructor of Dog class
    Dog( String name, int age, String breed , int noOfLegs){
        super(name,age);
        this.breed=breed;
        this.noOfLegs=noOfLegs;
    }
    //overriding method of animal class
    @Override
    public void makeSound(){
        System.out.println("Dog is barking");
    }
    //method of Dog class
    public void display(){
        System.out.println("Name of Dog is "+name);
        System.out.println("Age of Dog is "+age);
        System.out.println("Breed of Dog is "+breed);
        System.out.println("No of legs of Dog is "+noOfLegs);
    }

}
class Cat extends Animal{
    //attribute of Cat class
    String colour;
    int noOfLegs;
    //constructor of Cat class
    Cat(String name, int age, String colour , int noOfLegs){
        super(name ,age);
        this.colour=colour;
        this.noOfLegs=noOfLegs;
    }
    //overriding method of animal class
    @Override
    public void makeSound(){
        System.out.println("Cat is meowing");
    }
    //method of Cat class
    public void display(){
        System.out.println("Name of Cat is "+name);
        System.out.println("Age of Cat is "+age);
        System.out.println("Colour of Cat is "+colour);
        System.out.println("No of legs of Cat is "+noOfLegs);
    }
}
class Bird extends Animal{
    //attribute of Bird class
    String type;
    int noOfLegs;
    //constructor of Bird class
    Bird(String name, int age, String type , int noOfLegs){
        super(name ,age);
        this.type=type;
        this.noOfLegs=noOfLegs;
    }
    //overriding method of animal class
    @Override
    public void makeSound(){
        System.out.println("Bird is chirping");
    }
    //method of Bird class
    public void display(){
        System.out.println("Name of Bird is "+name);
        System.out.println("Age of Bird is "+age);
        System.out.println("Type of Bird is "+type);
        System.out.println("No of legs of Bird is "+noOfLegs);
    }
}
public class Main{
    public static void main(String[] args){
        //creating the instance of Dog, Cat and Bird class
        Dog dog=new Dog("Tommy",5,"Labrador",4);
        Cat cat=new Cat("Kitty",3,"White",4);
        Bird bird=new Bird("Parrot",2,"Pet",2);
        //calling the method of Dog, Cat and Bird class
        dog.display();
        dog.makeSound();
        System.out.println();
        cat.display();
        cat.makeSound();
        System.out.println();
        bird.display();
        bird.makeSound();
    }
}

