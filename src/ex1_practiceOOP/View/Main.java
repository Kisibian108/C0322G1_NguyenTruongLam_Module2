package ex1_practiceOOP.View;

import ex1_practiceOOP.Model.Person;
import ex1_practiceOOP.Service.ArrayListIpm;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("1.Chon sap xep theo luong tang dan " + "\n" + "2.Chon sap xep theo ten tang dan" );
        int choose = Integer.parseInt(scanner.nextLine());

        switch (choose){
            case 1:
                ArrayListIpm.sortBySalary();
                break;
            case 2:
                ArrayListIpm.sortByName();
                break;
        }
    }
}
