package ss15_ExceptionDebug.Exercise;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
    static boolean check = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            check = true;
            System.out.println("Nhap canh a");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap canh b");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap canh c");
            int c = Integer.parseInt(scanner.nextLine());
            IllegalTriangleException triang = new IllegalTriangleException();
            triang.triang(a, b, c);
        }while (check);
    }
    private void triang(double a, double b, double c) {
        try {
            if (a + b < c || b + c < a || a + c < b || a < 0 || b < 0 || c < 0) {
                check = true;
                throw new IllegalTriangleException("tam giac ko hop le");
            }
            System.out.println("tam giac hop le");
            check = false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


