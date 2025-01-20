class Vehicle{

    //define attributes
    public static int registrationFees = 900;
    private  String ownerName;
    public String vehicleType;
    private final long registrationNumber;
    private int days;


    //create constructors
    Vehicle(String ownerName, String vehicleType, long registrationNumber, int days){
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
        this.days = days;
    }

    //method to update registration fees
    static void updateRegistrationFees(int days, long registrationNumber){
        if(days > 10){
            System.out.println("New registration fees for registration number "+ registrationNumber + " is: " + (registrationFees * 2));
        }
        else{
            System.out.println("Your registration fees will be same.");
        }
    }

    //method to display details 
    void displayVehicleDetails(){
        System.out.println("Owner Name: " +ownerName);
        System.out.println("Vehicle Type: " +vehicleType);
        System.out.println("registration Number: " +registrationNumber);
        System.out.println("Number of days: " +days);
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Om", "Merserati",8888222, 3);
        Vehicle vehicle2 = new Vehicle("Harsh", "Cycle", 22444, 19);

        //check if object is a instance of class
        if(vehicle1 instanceof Vehicle){
            vehicle1.displayVehicleDetails();
        }
        if(vehicle2 instanceof Vehicle){
            vehicle2.displayVehicleDetails();
        }

        Vehicle.updateRegistrationFees(42, 8888222);
    }
}

