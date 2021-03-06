package ss7_AbstractClass.Exercise.Resizeable;

import ss6_Inheritance.Practice.Rectangle;
import ss7_AbstractClass.Exercise.Colorable.Colorable;

public class Square extends Rectangle implements Resizeable {

    double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Area of Square : "
                + getArea() + "";
    }

    @Override
    public void resize(double percent) {
        super.width *= percent / 100;
        super.length *= percent / 100;
    }
}
