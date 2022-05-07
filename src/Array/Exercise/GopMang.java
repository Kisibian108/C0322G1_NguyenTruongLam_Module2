package Array.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap kich thuoc mang 1:");
        int size1 = scanner.nextInt();
        System.out.println("Nhap phan tu mang 1");
        int[] array1 = new int[size1];

        int c = 0;
        for (int i = 0; i < size1; i++) {
            System.out.println("Phan tu thu " + i + " la: ");
            array1[i] = scanner.nextInt();

        }

        System.out.println("Nhap kich thuoc mang 2:");
        int size2 = scanner.nextInt();
        System.out.println("Nhap phan tu mang 2");
        int[] array2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            System.out.println("Phan tu thu " + i + " la: ");
            array2[i] = scanner.nextInt();
        }



        int[] array3 = new int[size1+size2];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            c++;
        }
        for (int j = 0; j < array2.length; j++) {
            array3[c++] = array2[j];
        }

        System.out.println(Arrays.toString(array3));
        
    }
}
