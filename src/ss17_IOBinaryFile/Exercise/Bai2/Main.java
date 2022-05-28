package ss17_IOBinaryFile.Exercise.Bai2;

import ss17_IOBinaryFile.Exercise.Bai1.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void writeToFile(String source, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(source);
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

    static List<Product> list = new ArrayList<>();
    static {
        list.add(new Product(1, "Iphone", 1000, 10, "Apple"));
        list.add(new Product(2, "Xiaomi", 500, 5, "China"));
        list.add(new Product(3, "Macbook", 900, 8, "Apple"));
    }

    public static void main(String[] args) {
        writeToFile("src/ss17_IOBinaryFile/Exercise/Bai2/Source", list);
        List<Product> products = readDataFromFile("src/ss17_IOBinaryFile/Exercise/Bai2/Source");
        for (Product product: products) {
            System.out.println(product);
        }
        writeToFile("src/ss17_IOBinaryFile/Exercise/Bai2/Target", list);
    }
}
