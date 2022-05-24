package ss13_Sorting.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Nhap gia tri mang");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mang truoc sap xep la");
        System.out.println(Arrays.toString(array));
        System.out.println("Mang sau sap xep la");
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
