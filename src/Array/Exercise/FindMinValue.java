package Array.Exercise;

import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang:");
        int size = scanner.nextInt();
        int [] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu " + i);
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Gia tri nho nhat la " + min);
    }
}
