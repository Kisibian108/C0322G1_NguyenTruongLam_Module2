package IntroductionJava.Exercise;

import java.util.Scanner;

public class DisplayFirst20PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        System.out.println("20 first prime numbers: ");
        while (count < 20) {
            int N = 2;
            boolean check = true;
            while (N <= Math.sqrt(number)) {
                if (number % N == 0) {
                    check = false;
                    break;
                }
                N++;
            }
            if (check) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}

