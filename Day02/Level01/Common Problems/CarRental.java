public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static double dailyRate = 50.0;  // Fixed rate per day

    // Default constructor
    public CarRental() {
        this.customerName = "Om Tiwari";
        this.carModel = "Merserati";
        this.rentalDays = 3;
    }
    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    //using getters and setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public static double getDailyRate() {
        return dailyRate;
    }

    public static void setDailyRate(double dailyRate) {
        CarRental.dailyRate = dailyRate;
    }


    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

class Main{
    public static void main(String[] args) {
        CarRental car1 = new CarRental();
        car1.displayRentalDetails();
        System.out.println("=====================================");
        CarRental car2 = new CarRental("Rahul", "Swift", 5);
        car2.displayRentalDetails();
    }
}
