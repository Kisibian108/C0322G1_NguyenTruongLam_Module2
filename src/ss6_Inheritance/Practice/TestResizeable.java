package ss6_Inheritance.Practice;

import ss6_Inheritance.Practice.Circle;
import ss6_Inheritance.Practice.Rectangle;
import ss6_Inheritance.Practice.Shape;
import ss6_Inheritance.Practice.Square;

import java.util.Arrays;
import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {
        Shape [] shape = new Shape[3];
        shape[0] = new Circle("Yellow", false, 4.6);
        shape[1] = new Square(6);
        shape[2] = new Rectangle(4,8);

        System.out.println("Dien tich truoc khi thay doi la: ");
        for (Shape shape1: shape) {
            System.out.println(shape1);
        }

        System.out.println("Sau khi thay doi kich thuoc la: ");
        for (Shape shape1: shape) {
            shape1.resize(Math.random()*1000);;
        }
        Shape.printShape(shape);
    }
}
