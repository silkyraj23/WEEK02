public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.0;  

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    } 
    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }
    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    
    }
    //main method
    public static void main(String[] args) {
       // Creating vehicle instances
        Vehicle vehicle1 = new Vehicle("Om", "Car");
        Vehicle vehicle2 = new Vehicle("HarshVeer", "Cycle");
       // Displaying vehicle details before updation of the registration fee
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
       // Updating the registration fee using the class method
        Vehicle.updateRegistrationFee(120.0);
       // Displaying vehicle details after updation of the registration fee
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}

