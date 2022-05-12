package ss6_Inheritance.Exercise.CircleAndCylinder;

import ss6_Inheritance.Practice.Main;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return Math.PI * getRadius() * getRadius() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                "volume=" + getVolume() +
                '}';
    }
}
