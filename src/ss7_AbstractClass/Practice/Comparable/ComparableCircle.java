package ss7_AbstractClass.Practice.Comparable;

import ss6_Inheritance.Practice.Circle;

public class ComparableCircle extends Circle
            implements Comparable<ComparableCircle>{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return  -1;
        else return 1;
    }


}
