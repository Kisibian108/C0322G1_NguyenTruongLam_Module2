package Array.Exercise;

import java.util.Scanner;

public class TinhTongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kich thuoc  ma tran la: ");
        int i = scanner.nextInt();

        double[][] array = new double[i][i];

        for (int k = 0; k < i; k++) {
            for (int l = 0; l < i; l++) {
                System.out.println("Nhap phan tu thu : " + k + "," + l);
                array[k][l] = scanner.nextInt();
            }
        }

        double sum = 0;
        for (int k = 0; k <i  ; k++) {
            for (int j = 0; j < i; j++) {
                if ( k == j ){
                    sum = sum + array[k][j];
                }
            }
        }
        System.out.println(sum);
    }
    }

