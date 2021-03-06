package ss7_AbstractClass.Exercise.Resizeable;

import ss6_Inheritance.Practice.Shape;
import ss7_AbstractClass.Exercise.Colorable.Colorable;

public class Circle extends Shape implements Resizeable {
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

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "Area of Circle : " + getArea();
    }

    @Override
    public void resize(double percent) {
        this.radius *= (percent / 100);
    }

}
