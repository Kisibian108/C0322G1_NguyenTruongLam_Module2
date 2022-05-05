package IntroductionJava.Exercise;

import java.util.Scanner;

public class DocSoThanhChu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("So can doc la: ");
        int a = input.nextInt();

        if (a <= 20) {
            switch (a) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
                case 20:
                    System.out.println("Twenty");
                    break;
                default:
                    System.out.println(" out of ability");

            }
        } else if (a < 100) {
            switch (a / 10) {
                case 2:
                    System.out.println("Twenty");
                    break;
                case 3:
                    System.out.println("Thirty");
                    break;
                case 4:
                    System.out.println("Fourty");
                    break;
                case 5:
                    System.out.println("Fifty");
                    break;
                case 6:
                    System.out.println("Sixty");
                    break;
                case 7:
                    System.out.println("Seventy");
                    break;
                case 8:
                    System.out.println("Eighty");
                    break;
                case 9:
                    System.out.println("Ninety");
                    break;
            }


            switch (a % 10) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if (a < 1000) {

            switch (a / 100) {
                case 1:
                    System.out.println("One hundred");
                    break;
                case 2:
                    System.out.println("Two hundred");
                    break;
                case 3:
                    System.out.println("Three hundred");
                    break;
                case 4:
                    System.out.println("Four hundred");
                    break;
                case 5:
                    System.out.println("Five hundred");
                    break;
                case 6:
                    System.out.println("Six hundred");
                    break;
                case 7:
                    System.out.println("Seven hundred");
                    break;
                case 8:
                    System.out.println("Eight hundred");
                    break;
                case 9:
                    System.out.println("Nine hundred");
                    break;
            }
                switch ((a/10)%10 ) {
                    case 2:
                        System.out.println("Twenty");
                        break;
                    case 3:
                        System.out.println("Thirty");
                        break;
                    case 4:
                        System.out.println("Fourty");
                        break;
                    case 5:
                        System.out.println("Fifty");
                        break;
                    case 6:
                        System.out.println("Sixty");
                        break;
                    case 7:
                        System.out.println("Seventy");
                        break;
                    case 8:
                        System.out.println("Eighty");
                        break;
                    case 9:
                        System.out.println("Ninety");
                        break;
                }


                switch (a % 10) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
        }
    }


