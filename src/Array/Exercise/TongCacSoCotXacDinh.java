package Array.Exercise;

import java.util.Scanner;

public class TongCacSoCotXacDinh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kich thuoc hang ma tran la: ");
        int i = scanner.nextInt();
        System.out.println("Kich thuoc cot ma tran la: ");
        int j = scanner.nextInt();
        double[][] array = new double[i][j];

        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.println("Nhap phan tu thu : " + k + "," + l);
                array[k][l] = scanner.nextInt();
            }
        }

        System.out.println("Muon tinh tong cot may:");
        int col = scanner.nextInt();
        double sum = 0;
        for (int k = 0; k <i  ; k++) {
            sum = sum + array[k][col];
        }
        System.out.println(sum);
    }
}
