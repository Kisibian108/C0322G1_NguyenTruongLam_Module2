package Array.Practice;

import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
    int size; // khai bao bien size
    int[] array; // khai bao mang co ten array
    Scanner scanner = new Scanner(System.in); // tao mot doi tuong scanner tu lop scanner nhap du lieu tu ban phim
    do{
        System.out.print("Enter a size");
        size = scanner.nextInt();
        if (size > 20 )
            System.out.println("Size should not exceed 20");
    } while (size > 20);   // dung vong lap do While va cau truc if de hien thi neu size qua 20
    array = new int[size];
    int i = 0;
    while (i < array.length){
        System.out.print("Enter element" + (i+1) + " : " );
        array[i] = scanner.nextInt();
        i++;
    }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
            for (int j = 0; j < array.length; j++) {
                if ( array[j] > max ){
                    max = array [j];
                    index = j + 1;
                }
            }
            System.out.println("The largest property value in the list is " + max + ", at position " + index);
    }
}
