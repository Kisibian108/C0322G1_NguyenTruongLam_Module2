package IntroductionJava.Exercise;

import java.util.Scanner;

public class PrintFirst20PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int numbers = 2;
        while (count < 20) {
            boolean check = true;
            int n = 2;
            while (n <= Math.sqrt(numbers)) {
                if (numbers % n == 0) {
                    check = false;
                    break;
                }
                n++;
            }
            if (check) {
                System.out.println(numbers );
                count++;
            }
            numbers ++;
        }
    }
}
