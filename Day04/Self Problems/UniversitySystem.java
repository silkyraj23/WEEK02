import java.util.ArrayList;
import java.util.List;

// Faculty class
class Faculty {
    private String name;

    // Constructor
    public Faculty(String name) {
        this.name = name;
    }

    // Get the name of the faculty member
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Department class
class Department {
    private String name;

    // Constructor
    public Department(String name) {
        this.name = name;
    }

    // Get the name of the department
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// University class
class University {
    private String name;
    private List<Department> departments; // Composition: Departments belong to the University
    private List<Faculty> facultyMembers; // Aggregation: Faculty can exist independently

    // Constructor
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    // Add a department to the university
    public void addDepartment(String departmentName) {
        Department newDepartment = new Department(departmentName);
        departments.add(newDepartment);
    }

    // Add a faculty member to the university
    public void addFaculty(String facultyName) {
        Faculty newFaculty = new Faculty(facultyName);
        facultyMembers.add(newFaculty);
    }

    // Display all departments in the university
    public void displayDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println(" - " + department.getName());
        }
    }

    // Display all faculty members associated with the university
    public void displayFacultyMembers() {
        System.out.println("Faculty members in " + name + ":");
        for (Faculty faculty : facultyMembers) {
            System.out.println(" - " + faculty.getName());
        }
    }

    // Delete the university (simulate deletion of all departments)
    public void deleteUniversity() {
        System.out.println("Deleting university " + name + "...");
        departments.clear();
        System.out.println("All departments have been removed. Faculty members remain.");
    }
}

// Main class to demonstrate the university system
public class UniversitySystem {
    public static void main(String[] args) {
        // Create a university
        University university = new University("RGPV University");

        // Add departments
        university.addDepartment("Computer Science");
        university.addDepartment("Mathematics");
        university.addDepartment("Physics");

        // Add faculty members
        university.addFaculty("Dr. Sumit vashishtha");
        university.addFaculty("Dr. Megha vashishtha");

        // Display departments and faculty members
        university.displayDepartments();
        university.displayFacultyMembers();
        // Delete the university
        university.deleteUniversity();
        // Try to display departments after deletion
        university.displayDepartments();
        // Display faculty members to show they still exist
        university.displayFacultyMembers();
    }
}
