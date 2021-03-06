package ss7_AbstractClass.Exercise.Colorable;

import ss6_Inheritance.Practice.Shape;
import ss7_AbstractClass.Exercise.Resizeable.Resizeable;

public class Rectangle extends Shape implements Colorable {
    double width;
    double length;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return "Area of Rectangle: " + getArea();
    }

    @Override
    public void resize(double percent) {
        this.length *= (percent / 100);
        this.width *= (percent / 100);
    }
}
