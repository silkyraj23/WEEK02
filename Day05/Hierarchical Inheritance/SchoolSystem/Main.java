class Person{
    String name;
    int age;
    String address;
    //constructor
    Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //method to display person details
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
class Teacher extends Person{
    double salary;
    String subject;
    //constructor
    public Teacher(String name, int age, String address, double salary, String subject){
        super(name, age, address);
        this.salary = salary;
        this.subject = subject;
    }
    //method to display teacher details
    public void display(){
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
    }
    //method to display role
    public void role(){
        System.out.println("Teacher");
    }
}
class Student extends Person{
    int rollNumber;
    String course;
    //constructor
    public Student(String name, int age, String address, int rollNumber, String course){

        super(name, age, address);    
        this.name = name;
        this.age = age;
        this.address = address;
        this.rollNumber = rollNumber;
        this.course = course;
    }
    //method to display student details
    public void display(){
        super.display();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
    //method to display role
    public void role(){
        System.out.println("Student");
    }
}
class Staff extends Person{
    double salary;
    String department;
    //constructor
    Staff(String name, int age, String address, double salary, String department){
        super(name, age, address);  
        this.salary = salary;
        this.department = department;
    }
    //method to display staff details
    public void display(){
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
    //method to display role
    public void role(){
        System.out.println("Staff");
    }
}
//main method to demonstrate the 
public class Main{
    public static void main(String[] args) {
        //creating teacher object
        Teacher teacher = new Teacher("Shamiksha", 30, "Patna", 50000, "Computer Science");
        //creating student object
        Student student = new Student("Anshu Priya", 20, "Mahua", 101, "Engineering");
        //creating staff object
        Staff staff = new Staff("Rahul", 25, "Patna", 30000, "Administration");
        //displaying details
        teacher.display();
        teacher.role();
        student.display();
        student.role();
        staff.display();
        staff.role();
    }
}