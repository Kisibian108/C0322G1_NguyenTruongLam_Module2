package ss7_AbstractClass.Exercise.Colorable;

import ss6_Inheritance.Practice.Circle;
import ss6_Inheritance.Practice.Rectangle;
import ss6_Inheritance.Practice.Shape;
import ss6_Inheritance.Practice.Square;
import ss7_AbstractClass.Exercise.Colorable.Colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Square(5);
        shape[1] = new Circle("Green", false, 3);
        shape[2] = new Rectangle(3.5, 2.6);

        System.out.println("Dien tich la: ");
        for (Shape shape1 : shape) {
            System.out.println(shape1);
        }
        System.out.println("To nhu the nao: ");
        for (Shape shape1 : shape) {
            if (shape1 != null) {
                ((Colorable) shape1).howToColor();
            }
        }
    }
}
