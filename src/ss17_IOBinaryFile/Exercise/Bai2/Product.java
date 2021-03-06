package ss17_IOBinaryFile.Exercise.Bai2;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private double price;
    private int amount;
    private String production;

    public Product(int id, String name, double price, int amount, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.production = production;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id =" + id +
                ", name ='" + name +
                ", price =" + price +
                ", amount =" + amount +
                ", production ='" + production +
                '}';
    }
}
