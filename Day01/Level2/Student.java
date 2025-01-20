public class Student {
    
    //create attributes of students
    String name;
    String rollNumber;
    int marks;

    //create a constructor to initialize student attributes
    Student(String name, String rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    //create a method to calculate the grade of Students
    void calculateGrade(){
        if(marks >= 90){
            System.out.println("Grade: A+");
        }else if(marks >= 80){
            System.out.println("Grade: A");
        }else if(marks >= 70){
            System.out.println("Grade: B+");
        }else if(marks >= 60){
            System.out.println("Grade: B");
        }else if(marks >= 50){
            System.out.println("Grade: C");
        }else if(marks >= 40){
            System.out.println("Grade: D");
        }else{
            System.out.println("Grade: F");
        }
    }

    //create a method to display the details of students
    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
    //main method
    public static void main(String[] args) {
        
        //Create an object of the Student class
        Student student = new Student("shamiksha", "0111211103", 100);
        student.displayDetails();
        student.calculateGrade();

    }
}
