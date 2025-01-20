public class Circle {
    // Creating the attributes of Circle
    int radius;
    //constructor to initialize the attributes
    Circle(int radius){
        this.radius = radius;
    }
    //display the area of the circle
    void display(){
        System.out.println("Area of Circle of radius is "+this.radius + " is "+ Math.PI * Math.pow(radius,2 ));
    }
    //main method
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.display();
    }
}
