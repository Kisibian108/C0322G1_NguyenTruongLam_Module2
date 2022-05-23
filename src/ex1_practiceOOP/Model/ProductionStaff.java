package ex1_practiceOOP.Model;



public class ProductionStaff extends Person  {

    private int productAmount;

    public ProductionStaff() {
    }

    @Override
    public double getTotalSalary() {
        return this.getProductAmount() * 50000;
    }


    public ProductionStaff(int productAmount) {
        this.productAmount = productAmount;
    }

    public ProductionStaff(String name, int birthday, String address, int productAmount) {
        super(name, birthday, address);
        this.productAmount = productAmount;
    }

    public ProductionStaff(String name, int birthday, String address, double salary, double totalSalary, int productAmount) {
        super(name, birthday, address, salary, totalSalary);
        this.productAmount = productAmount;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }


    @Override
    public String toString() {
        return "ProductionStaff{" + super.toString() +
                "productAmount=" + productAmount + "salary: " + getTotalSalary() +
                '}';
    }
}
