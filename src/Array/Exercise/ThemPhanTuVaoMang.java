package Array.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
        System.out.println("So can chen la: ");
        int x = input.nextInt();

        System.out.println("Nhap vi tri can chen: ");
        int index = input.nextInt();

        if(index<=-1 || index > array.length-1){
            System.out.println("Khong chen duoc phan tu vao mang");
        }

        for(int i = array.length -1; i > index;i --){
            array[i] = array[i-1];
        }
        array[index] = x;

        System.out.println(Arrays.toString(array));
    }
}
