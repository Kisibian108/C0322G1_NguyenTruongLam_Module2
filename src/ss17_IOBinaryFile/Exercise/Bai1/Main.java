package ss17_IOBinaryFile.Exercise.Bai1;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int count;
    static Scanner scanner = new Scanner(System.in);
    static List<Product> list = new ArrayList<>();
    static {
        System.out.println("Block static");
        list.add(new Product(1, "Iphone", 1000, 10, "Apple"));
        list.add(new Product(2, "Xiaomi", 500, 5, "China"));
        list.add(new Product(3, "Macbook", 900, 8, "Apple"));
        list.add(new Product(4, "GalaxyS3", 700, 7, "Samsung"));
        list.add(new Product(5, "Dell", 300, 5, "Intel"));
        count = 5;
        writeToFile("src/ss17_IOBinaryFile/Exercise/Bai1/Target", list );
    }

    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path){
        List<Product> list = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return list;
    }

    public static void addNewProduct() {
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();

        System.out.println("Nhap gia: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhap so luong: ");
        int amount = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap nha san xuat: ");
        String production = scanner.nextLine();

        System.out.println("Them san pham thanh cong!");

        list.add(new Product(count + 1, name, price, amount, production));

        count++;
        displayList();
    }

    public static void displayList() {
        for (Product item : list) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void edit() {
        System.out.println("Nhap ID muon sua: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product item : list) {
            if (item.getId() == id) {
                item.setId(id);

                System.out.println("Nhap ten muon sua: ");
                String name = scanner.nextLine();
                item.setName(name);

                System.out.println("Nhap gia muon sua: ");
                double price = Double.parseDouble(scanner.nextLine());
                item.setPrice(price);

                System.out.println("Nhap so luong muon sua: ");
                int amount = Integer.parseInt(scanner.nextLine());
                item.setAmount(amount);

                System.out.println("Nhap nha san xuat muon sua: ");
                String production = scanner.nextLine();
                item.setProduction(production);

                break;
            }
        }
        displayList();
    }

    public static void delete() {
        System.out.println("Nhap id muon xoa: ");
        int id = Integer.parseInt(scanner.nextLine());
        try {
            for (int i = 0; i < list.size(); i++) {
                if(id == list.get(i).getId()){
                    list.remove(i);
                    break;
                }
            }
            displayList();
        } catch (IndexOutOfBoundsException e){
            System.out.println("ID vuot qua list");
        }

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
        System.out.println("Nhap ten can tim kiem: ");
        String name = scanner.nextLine();
        if (checkNameExists(name)) {
            for (Product item : list) {
                if (item != null && item.getName().contains(name)) {
                    System.out.println(item);
                }
            }
        } else {
            System.out.println("Ten ko ton tai!");
        }
    }

    public static void main(String[] args) {
        List<Product> productsDataFromFile = readDataFromFile("src/ss17_IOBinaryFile/Exercise/Bai1/Target");
        for (Product product : productsDataFromFile){
            System.out.println(product);
        }
        do {
            System.out.println("------------Production Management---------");
            System.out.println("1. Display list Product");
            System.out.println("2. Add new Product");
            System.out.println("3. Search Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Update Product");
            System.out.println("6. Exit ");
            System.out.println("Choose options: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    displayList();
                    break;
                case 2:
                    addNewProduct();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    edit();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
