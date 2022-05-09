package ss3_ClassAndMethod.Exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap gia tri b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap gia tri c: ");
        double c = scanner.nextDouble();

        BuildQuadraticEquationClass buildQuadraticEquationClass = new BuildQuadraticEquationClass(a, b, c);
        if (buildQuadraticEquationClass.getDiscriminant() > 0) {
            System.out.println("Nghiem 1 phuong trinh la: " + buildQuadraticEquationClass.getRoot1());
            System.out.println("Nghiem 2 phuong trinh la: " + buildQuadraticEquationClass.getRoot2());
        } else if (buildQuadraticEquationClass.getDiscriminant() == 0) {
            System.out.println("Nghiem phuong trinh la: " + buildQuadraticEquationClass.getRoot1());
        } else {
            System.out.println(" The equation has no roots");
        }
    }
}
