class Student{
    static String universityName;
    private static int countStudent = 0;
    private String name;
    private final int rollNumber;
    private char grade;
    
    //Constructor to initialize the attributes
    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    
    // Mehtod to count the total students
    static void displayTotalStudents(){
        System.out.println("Toal Number of students is:- "+ countStudent);
    }
    
    //Display the student details
    void displayStudentDetails(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Roll Number: "+rollNumber);
        System.out.println("Student grade: "+grade);
    }
}
public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student student1 = new Student("Tiwari",21,'A');
        Student student2 = new Student("Om",40,'F');

        if (student1 instanceof Student) {
            student1.displayStudentDetails();
        }
        if (student2 instanceof Student) {
            student2.displayStudentDetails();
        }
        Student.displayTotalStudents();
    }
}