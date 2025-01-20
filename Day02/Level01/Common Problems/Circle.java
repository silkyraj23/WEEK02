public class Circle {
    
    //initialize attribute
    private double radius;
    
    //default constructor
    Circle(){
        this(5);
    }
    
    //create a parameterized constructor
    Circle(double radius){
        this.radius = radius;
    }
    
    //getter and setter methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //method to display area of circle
    public void getArea() {
        System.out.println("Area of circle is : "+Math.PI * radius * radius);
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(7);

        //calling default constructor
        circle1.getArea();

        //calling parameterized constructor
        circle2.getArea();
    }
}
