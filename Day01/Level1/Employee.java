public class Employee {
    //Declaring attributes of Employee
    String name;
    String id;
    int salary;
    //Creating a constructor to initialize the attributes
    Employee(String name, String id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    //Display Details of Employee
    void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    //main method
    public static void main(String[] args) {
        
        Employee display = new Employee("Shamiksha","103" , 3000000);
        display.printDetails();

    }
}

