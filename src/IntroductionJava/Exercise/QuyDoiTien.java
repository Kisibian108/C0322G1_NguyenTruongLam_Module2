package IntroductionJava.Exercise;

import java.util.Scanner;

public class QuyDoiTien {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so tien USD: ");
        usd = sc.nextDouble();
        double Convert = usd * 23000;
        System.out.print("Gia tri VND " + Convert);
    }

}
