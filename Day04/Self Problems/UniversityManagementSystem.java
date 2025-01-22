import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " has been assigned to " + courseName);
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.getName() + " has been enrolled in " + courseName);
    }

    // Display course details
    public void courseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.getName());
        } else {
            System.out.println("No professor assigned yet.");
        }
        System.out.println("Enrolled students:");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.getName());
        }
    }
}

// Professor class
class Professor {
    private String name;

    // Constructor
    public Professor(String name) {
        this.name = name;
    }

    // Get the professor's name
    public String getName() {
        return name;
    }
}

// Student class
class Student {
    private String name;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Get the student's name
    public String getName() {
        return name;
    }
}

// Main class to demonstrate the university system
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor("Dr. Sumit vashishtha");
        Professor professor2 = new Professor("Dr. Anil Kumar");

        // Create students
        Student student1 = new Student("Shamiksha");
        Student student2 = new Student("Khushi chandak");
        Student student3 = new Student("Nimish Rathi");

        // Create courses
        Course course1 = new Course("Computer Science 103");
        Course course2 = new Course("Mathematics 101");

        // Assign professors to courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        // Enroll students in courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student2);
        course2.enrollStudent(student3);

        // Display course details
        course1.courseDetails();
        course2.courseDetails();
    }
}

