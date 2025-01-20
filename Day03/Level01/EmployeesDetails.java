class Employee {
    static String companyName;
    private static int totalEmployee = 0;
    private String name;
    private final int id;
    private String designation;

    // Constructor or to initialize the attributes
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployee++;
    }

    // method to display the total employee in the company
    static void displayTotalEmployee() {
        System.out.println("Total Employee in the company: " + totalEmployee);
    }

    // method to display the employee's detals
    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee designation: " + designation);
    }
    
}

public class EmployeesDetails{
    public static void main(String[] args) {

        // create object of Employee class
        Employee employee1 = new Employee("Om", 0, "Guard");
        Employee employee2 = new Employee("Harsh", 001, "Project Head");
        Employee.displayTotalEmployee();

        // check the instance
        if (employee1 instanceof Employee) {
            employee1.displayEmployeeDetails();
        }
        if (employee2 instanceof Employee) {
            employee2.displayEmployeeDetails();
        }
    }
}