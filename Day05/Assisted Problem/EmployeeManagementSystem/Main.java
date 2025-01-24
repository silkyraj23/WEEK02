class Employee{
    //attributes of Employee class
    String name;;
    int age;
    int salary;
    //constructor of Employee class 
    Employee(String name , int age , int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    //method of Employee class
    public void display(){
        System.out.println("Name of Employee is "+name);
        System.out.println("Age of Employee is "+age);
        System.out.println("Salary of Employee is "+salary);
    }
}
class Manager extends Employee{
    //attribute of Manager class
    int teamSize;
    //constructor of Manager class
    Manager(String name , int age , int salary ,int teamSize){
        super(name,age,salary);
        this.teamSize=teamSize;
    }
    //method of Manager class
    public void meeting(){
        System.out.println("Manager is conducting meeting");
    }
    public void display(){
        System.out.println("Name of Manager is "+name);
        System.out.println("Age of Manager is "+age);
        System.out.println("Salary of Manager is "+salary);
        System.out.println("Team size of Manager is "+teamSize);
    }
    
}
class Developer extends Employee{
    //attribute of Developer class
    String programmingLanguage;;
    //constructor of Developer class
    Developer(String name , int age , int salary ,String programmingLanguage){
        super(name,age,salary);
        this.programmingLanguage=programmingLanguage;
    }
    //method of Developer class
    public void coding(){
        System.out.println("Developer is coding");
    }
    public void display(){
        System.out.println("Name of Developer is "+name);
        System.out.println("Age of Developer is "+age);
        System.out.println("Salary of Developer is "+salary);
        System.out.println("programming language on which Developer is working  "+programmingLanguage);
    }
    
}
class Intern extends Employee{
    //attribute of Intern class
    String project;
    //constructor of Intern class
    Intern(String name , int age , int salary ,String project){
        super(name,age,salary);
        this.project=project;
    }
    //method of Intern class
    public void learning(){
        System.out.println("Intern is learning");
    }
    public void display(){
        System.out.println("Name of Intern is "+name);
        System.out.println("Age of Intern is "+age);
        System.out.println("Salary of Intern is "+salary);
        System.out.println("Project on which Intern is working  "+project);
    } 
}
public class Main {
    //creating the instance of Employee, Manager, Developer and Intern class
    public static void main(String[] args) {
        Employee e1=new Employee("Rahul",25,25000);
        e1.display();
        System.out.println();
        Manager m1=new Manager("Rohit",30,50000,10);
        m1.display();
        System.out.println();
        Developer d1=new Developer("Raj",28,40000,"Java");
        d1.display();
        System.out.println();
        Intern i1=new Intern("Riya",22,20000,"Web Development");
        i1.display();
    }

    
}
