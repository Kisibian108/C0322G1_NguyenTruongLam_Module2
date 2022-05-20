package ss13_Finding.Exercise;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi:");
        String string = scanner.nextLine();
        int index = 0;
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i));;
        }
    }
}
