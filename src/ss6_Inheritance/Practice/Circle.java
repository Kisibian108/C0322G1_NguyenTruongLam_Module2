package ss6_Inheritance.Practice;

public class Circle extends Shape{
    double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with" +  getRadius() + "which is a subclass of " + super.toString();
    }
}
