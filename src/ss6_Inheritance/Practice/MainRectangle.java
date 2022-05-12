package ss6_Inheritance.Practice;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 3.5, 4.6);
        System.out.println(rectangle);
    }
    }



