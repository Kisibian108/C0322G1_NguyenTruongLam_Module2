package ss11_StackQueue.Exercise.DecimalToBinary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, i = 0;
        double[] binary = new double[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thap phan:");
        number = Integer.parseInt(scanner.nextLine());

        while (number != 0) {
            binary[i] = number % 2;
            number = number / 2;
            i++;
        }
        System.out.println("So nhi phan la :");
        for (int j = i - 1; j >= 0; j--) {
            System.out.println(binary[j]);
        }
    }
}
