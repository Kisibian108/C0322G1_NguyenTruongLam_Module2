package Array.Exercise;

import java.util.Scanner;

public class FindMaxValueArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //buoc 1
//    double [][] array = {{1.2,2,3,4,5.6},{6,7.5,8,19.5,9.2}};
//        int a = 0;
//        int b = 0;
//    double max = array[0][0];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if((array[i][j]) > max) {
//                max = array[i][j];
//                a = i;
//                b = j;
//                }
//            }
//        }
//        System.out.println("Gia tri lon nhat la " + max + " tai vi tri " + a +","+ b );

        // buoc 2

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
            double max = array[0][0];
            int a = 0;
            int b = 0;
            for (int l = 0; l < i; l++) {
                for (int m = 0; m < j; m++) {
                    if (array[l][m] > max){
                        max = array[l][m];
                        a = l;
                        b = m;
                }
            }
            }
            System.out.println("Gia tri max la " + max + "tai vi tri " + a + "," + b);
        }
    }

