package CRUD.Student;

import java.util.Scanner;

public class Main {
    public static Person[] personList = new Person[100];
    public static int count;

    static Scanner scanner = new Scanner(System.in);

    static  {
        System.out.println("Block static");
        personList[0] = new Student(1, "Lam", 30, true, 80);
        personList[1] = new Student(2, "Hai", 33, true, 80);
        personList[2] = new Teacher(3, "Chien", 28, true, 20);
        personList[3] = new Teacher(4, "Hoa", 27, false, 18);
        count = 4;
    }

    public static void displayList() {
        for (Person x : personList) {
            if (x != null)
                System.out.println(x);
        }
    }

    public static void add() {
        System.out.println("Chon hoc sinh hay teacher");
        System.out.println("1: Hoc sinh" + "\n" +
                "2: Teacher ");
        int input = Integer.parseInt(scanner.nextLine());
        switch (input) {
            case 1:

                System.out.println("Nhap ID:");
                int id = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhap ten");
                String name = scanner.nextLine();

                System.out.println("Nhap tuoi");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.println("Diem");
                double point = Double.parseDouble(scanner.nextLine());

                Student student = new Student(id, name, age, true, point);
                personList[count] = student;
                count++;
                displayList();
                break;

            case 2:

                System.out.println("Nhap ID:");
                int id1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhap ten");
                String name1 = scanner.nextLine();

                System.out.println("Nhap tuoi");
                int age1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhap luong");
                double salary = Double.parseDouble(scanner.nextLine());

                Teacher teacher = new Teacher(id1, name1, age1, true, salary);
                personList[count] = teacher;
                displayList();
                break;
        }
    }
        public static void delete(){
            System.out.println("Xoa id nao:");
            int id = Integer.parseInt(scanner.nextLine());
            for (Person x :personList) {

            }
        }

    public static void main(String[] args) {
        do {
            System.out.println("----------PersonManagement----------");
            System.out.println("1.Hien thi danh sach");
            System.out.println("2.Them moi danh sach");
            System.out.println("3.Xoa danh sach");
            System.out.println("4.Tim kiem ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    displayList();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    delete();
                    break;
            }
        } while (true);
    }

}