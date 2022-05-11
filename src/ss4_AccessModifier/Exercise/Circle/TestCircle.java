package ss4_AccessModifier.Exercise.Circle;

import ss4_AccessModifier.Exercise.Circle.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
