package IntroductionJava.Exercise;

import java.util.Scanner;

public class DisplayShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu dai: ");
        int length = scanner.nextInt();
        System.out.println("Nhap chieu rong: ");
        int width = scanner.nextInt();
        for (int i = 0 ; i < width; i++) {
            for(int j = 0; j < length; j ++ ){
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("Nhap chieu rong: ");
        int width1 = scanner.nextInt();
        for ( int i =0; i<=width1;i++){
            for ( int j =0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Nhap chieu rong: ");
        int width2 = scanner.nextInt();
            for(int i = 0; i < width2;i++){
                for( int j = i ; j < width; j++ ){
                    System.out.print("* ");
                }
                System.out.println();
            }


        System.out.println("Nhap chieu rong: ");
        int width3 = scanner.nextInt();
        for (int i = 0; i < width3; i++) {
            for (int j = i; j < width3; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}



