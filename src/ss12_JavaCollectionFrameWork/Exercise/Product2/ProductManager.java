package ss12_JavaCollectionFrameWork.Exercise.Product2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> list = new ArrayList();
    public static int count;
    static {
        list.add(new Product(1, "Iphone 12", 1000, 10, "Apple"));
        list.add(new Product(2, "Xiaomi 11", 800, 15, "Apple"));
        list.add(new Product(3, "Samsung 13", 1100, 12, "Apple"));
        list.add(new Product(4, "Macbook X", 700, 11, "Apple"));
        list.add(new Product(5, "Iphone 6S", 500, 9, "Apple"));
        count = 5;
    }


    public static void display() {
        for (Product item : list) {
            if (item != null)
                System.out.println(item);
        }
    }

    public static void add(){
        System.out.println("Nhap ten san pham ");
        String name = scanner.nextLine();

        System.out.println("Nhap gia muon sua");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhap so luong muon sua");
        int amount = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap nha san xuat muon sua");
        String production = scanner.nextLine();

        list.add(new Product(count+1,name, price, amount, production ));
        display();
        count++;
    }

    public static void edit() {
        System.out.println("Nhap id muon sua:");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product item : list) {
            if (item.getId() == id) {
                item.setId(id);

                System.out.println("Nhap ten muon sua");
                String name = scanner.nextLine();
                item.setName(name);

                System.out.println("Nhap gia muon sua");
                double price = Double.parseDouble(scanner.nextLine());
                item.setPrice(price);

                System.out.println("Nhap so luong muon sua");
                int amount = Integer.parseInt(scanner.nextLine());
                item.setAmount(amount);

                System.out.println("Nhap nha san xuat muon sua");
                String production = scanner.nextLine();
                item.setProduction(production);

                display();
            }
        }
    }

    private static void delete() {
        System.out.println("Nhap id muon xoa");
        int id = Integer.parseInt(scanner.nextLine());
        list.remove(id - 1);
        display();
    }


    private static boolean checkNameExists(String name) {
        for (Product item : list) {
            if (item != null && item.getName().contains(name)) {
                return true;
            }
        }
        return false;
    }

    public static void search() {
        System.out.println("Nhap ten can tim");
        String name = scanner.nextLine();
        if (checkNameExists(name)) {
            for (Product item : list) {
                if (item.getName().contains(name)) {
                    System.out.println(item);
                }
            }
        } else {
            System.out.println("Ten ko ton tai");
        }
    }

    public static void sortLower(){
        Collections.sort(list ,new ComparatorByLower());
    }

    public static void sortHigher(){
        Collections.sort(list, new ComparatorByHigher());
    }

    public static void main(String[] args) {
        do {
            System.out.println("1. Display list");
            System.out.println("2. Add new Product");
            System.out.println("3. Edit Product");
            System.out.println("4. Delete product");
            System.out.println("5. Search product");

            System.out.println("Moi lua chon:");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
            }
        } while (true);
    }
}
