// Superclass: Vehicle
class Vehicles {
    protected String model;
    protected int maxSpeed;
    // Constructor
    public Vehicles(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    // Display  details
    public void displayDetails() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}
// Interface:-
interface Refuelable {
    void refuel(); // Abstract method to be implemented by PetrolVehicle
}

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicles {
    private int batteryCapacity; // Battery capacity in kWh
    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }
    // Method specific to ElectricVehicle
    public void charge() {
        displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging the vehicle...");
    }
}
// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicles implements Refuelable {
    private int fuelCapacity; 
    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }
    @Override
    public void refuel() {
        displayDetails();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Refueling the vehicle...");
    }
}

// Main Class
public class main {
    public static void main(String[] args) {
        // Create objects for ElectricVehicle and PetrolVehicle
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 343, 95);
        PetrolVehicle toyota = new PetrolVehicle("Toyota Corolla", 180, 35);
        // Display details for each vehicle
        System.out.println("Electric Vehicle Details:");
        tesla.charge();
        System.out.println();

        System.out.println("Petrol Vehicle Details:");
        toyota.refuel();
    }
}