class Vehicle {
    int maxSpeed;
    String fuelType;
    //constructor of Vehicle class
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    public void start() {
        System.out.println("Vehicle is starting");
    }
    public void stop() {
        System.out.println("Vehicle is stopping");
    }
    public void displayInfo () {
        System.out.println("Max speed of Vehicle is " + maxSpeed);
        System.out.println("Fuel type of Vehicle is " + fuelType);
    }
}
class Car extends Vehicle{
    int noOfSeats;
    String color;
    //constructor of Car class
    Car( int maxSpeed,String fuelType,int noOfSeats,String color){
        super(maxSpeed,fuelType);
        this.noOfSeats=noOfSeats;
        color=this.color;
    }
    //method of Car class
    public void accelerate(){
        System.out.println("Car is accelerating");
    }
    public void honk(){
        System.out.println("Car is honking");
    }

    public void displayInfo () {
        System.out.println("Max speed of Car is " + maxSpeed);
        System.out.println("Fuel type of Car is " + fuelType);
        System.out.println("No of seats in Car is " + noOfSeats);
    }

}
class Truck extends Vehicle{
    int maxWeight;
    int noOfWheels;
    //constructor of Truck class
    Truck(int maxSpeed,String fuelType,int maxWeight,int noOfWheels){
        super(maxSpeed,fuelType);
        this.maxWeight=maxWeight;
        this.noOfWheels=noOfWheels;
    }

    //method of Truck class
    public void load(){
        System.out.println("Truck is loading");
    }
    public void unload(){
        System.out.println("Truck is unloading");
    }
    public void displayInfo () {
        System.out.println("Max speed of Truck is " + maxSpeed);
        System.out.println("Fuel type of Truck is " + fuelType);
        System.out.println("Max weight of Truck is " + maxWeight);
        System.out.println("No of wheels in Truck is " + noOfWheels);
    }
}
class Motorcycle extends Vehicle{
    String company;

    //constructor of Motorcycle class
    Motorcycle(int maxSpeed,String fuelType,String company){
        super(maxSpeed,fuelType);
        this.company=company;
    }
    //method of Motorcycle class
    public void run(){
        System.out.println("Motorcycle is running");
    }
    public void neadFuel(){
        System.out.println("Motorcycle need fuel");
    }
    
    public void displayInfo () {
        System.out.println("Max speed of Motorcycle is " + maxSpeed);
        System.out.println("Fuel type of Motorcycle is " + fuelType);
        System.out.println("company of Motorcycle is " + company);
    }
}
public class Main {
    //creating object of Vehicle, Car, Truck and Motorcycle class
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(100, "Petrol");
        Car car = new Car(120, "Petrol", 4, "Red");
        Truck truck = new Truck(80, "Diesel", 1000, 6);
        Motorcycle motorcycle = new Motorcycle(150, "Petrol", "Honda");
        vehicle.displayInfo();
        System.out.println();
        car.displayInfo();
        System.out.println();
        truck.displayInfo();
        System.out.println();
        motorcycle.displayInfo();
    }
    
}
