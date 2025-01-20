public class Course {
    private String courseName;
    private int duration;  
    private double fee;
    static String instituteName = "Default Institute";  

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    //use getter setter
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public static String getInstituteName() {
        return instituteName;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

class Main{
    public static void main(String[] args) {
        // Creating course instances
        Course course1 = new Course("Java Programming", 12, 300.0);
        Course course2 = new Course("Web Development", 10, 250.0);

        // Displaying course details before updating the institute name
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Updating the institute name using the class method
        Course.updateInstituteName("Tech Academy");

        // Displaying course details after updating the institute name
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}