package ex1_practiceOOP.Service;

import ex1_practiceOOP.Model.Manager;
import ex1_practiceOOP.Model.Operator;
import ex1_practiceOOP.Model.Person;
import ex1_practiceOOP.Model.ProductionStaff;

import java.util.Scanner;

public class ArrayIpm {
    static Scanner scanner = new Scanner(System.in);
    static  Person[] array = new Person[1000];

    static {
        array[0] = new Manager("Lam", 1992, "HaTinh", 10000000, 3.14);
        array[1] = new Manager("Linh", 1989, "Da Nang", 12000000, 3.41);
        array[3] = new Operator("Nam", 1943, "Quang Nam", 15);
        array[4] = new Operator("Ngoc", 1992, "Ha Noi", 15 );
        array[5] = new ProductionStaff("Hoa", 1987,"Hai Phong", 19);
        array[6] = new ProductionStaff("Hien", 1995, "Ha Tinh", 25);

    }
    public static void main(String[] args) {
        for (Person person: array) {
            // phai check null neu ko array se ra gia tri null
            if(person != null)
            System.out.println(person);
        }
    }

    //tu khoa instance of de kiem tra xem Manager, Operator, ProductionOperator co nam trong
    // class person ko

    // neu mang co 1001 phan tu thi se nem ra 1 exception outofbound
    // da hinh luc runtime the hien o luc chay 1 class person nhung co nhieu class con ke thua
    // class Manager, class Operator, class ProductionOperator


}
