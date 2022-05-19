package ss12_JavaCollectionFrameWork.Exercise;

import java.util.*;

public class Main {

    public static int count;
    static Scanner scanner = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();

    static {
        System.out.println("Block static");

        productList.add(new Product(1, "Iphone", 3000, 10, "Apple"));
        productList.add(new Product(2, "Iphone", 1000, 10, "Apple"));
        productList.add(new Product(3, "Iphone", 2000, 10, "Apple"));
        productList.add(new Product(4, "Iphone", 500, 10, "Apple"));
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

        productList.add(new Product(count + 1, name, price, amount, production));

        displayList();
    }

    public static void displayList() {
        for (Product item : productList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void edit() {
        System.out.println("Nhap ID muon sua: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product item : productList) {
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
        for (int i = id - 1; i < productList.size() - 1; i++) {
            var remove = productList.remove(i);
        }
    }

    private static boolean checkNameExists(String name) {
        for (Product item : productList) {
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
            for (Product item : productList) {
                if (item != null && item.getName().contains(name)) {
                    System.out.println(item);
                }
            }
        } else {
            System.out.println("Ten ko ton tai!");
        }
    }

    public static void main(String[] args) {
        Collections.sort(productList);
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