package ss4_AccessModifier.Exercise.Circle;

public class Circle {
    private double radius =  1;
    private String color = "Red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

     protected double getRadius(){
        return radius;
    }

     protected double getArea(){
        return 3.14 * this.radius * this.radius;
    }
}
