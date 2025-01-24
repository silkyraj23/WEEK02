class Course{
    String courseName;
    String courseID;
    int duration;
    //constructor
    Course(String courseName, String courseID, int duration){
        this.courseName = courseName;
        this.courseID = courseID;
        this.duration = duration;
    }
    //method to display course details
    void displayCourseDetails(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Course ID: " + courseID);
        System.out.println("Duration: " + duration + " months");
    }
}
class OnlineCourse extends Course{
    String courseLink;
    String platform;
    boolean isRecorded;
    //constructor
    OnlineCourse(String courseName, String courseID, int duration, String courseLink, String platform, boolean isRecorded){
        super(courseName, courseID, duration);
        this.courseLink = courseLink;
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    //method to display course details
    @Override
    void displayCourseDetails(){
        super.displayCourseDetails();
        System.out.println("Course Link: " + courseLink);
    }
}
class PaidOnlineCourse extends OnlineCourse{
    double courseFee;
    float discount;
    //constructor
    PaidOnlineCourse(String courseName, String courseID, int duration, String courseLink, String platform, boolean isRecorded, double courseFee, float discount){
        super(courseName, courseID, duration, courseLink, platform, isRecorded);
        this.courseFee = courseFee;
        this.discount = discount;
    }
    //method to display course details
    @Override
    void displayCourseDetails(){
        super.displayCourseDetails();
        System.out.println("Course Fee: $" + courseFee);
    }
}  
//main  class to demonstrate the hierarchy
public class Main{
    public static void main(String[] args){
        //creating object of OnlineCourse class
        OnlineCourse onlineCourse = new OnlineCourse("Python Programming", "PY101", 2, "www.pythonprogramming.com", "Coursera", false);
        //displaying course details
        onlineCourse.displayCourseDetails();
        System.out.println();
        //creating object of PaidOnlineCourse class
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Java Programming", "JAV101", 3, "www.javaprogramming.com", "Udemy", true, 200, 10);
        //displaying course details
        paidOnlineCourse.displayCourseDetails();
    }
}              