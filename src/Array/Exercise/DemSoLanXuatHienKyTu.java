package Array.Exercise;

import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi:");
        String string = scanner.nextLine();
        char[] arr = string.toCharArray();
        System.out.println("Nhap vao ky tu: ");
        String kyTu = scanner.nextLine();
        char [] kyTu1= kyTu.toCharArray();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if ( kyTu1[0] == arr[i] ) {
                count++;
            }
        }
        System.out.println("ky tu "+ kyTu1[0]+ "xuat hien "+count+" lan");
    }
}
