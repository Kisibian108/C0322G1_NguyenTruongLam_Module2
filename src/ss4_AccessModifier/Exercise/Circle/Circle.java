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
        return Math.PI * this.radius * this.radius;
    }
}
