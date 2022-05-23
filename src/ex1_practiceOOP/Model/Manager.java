package ex1_practiceOOP.Model;



public class Manager extends Person implements  Comparable<Person> {

    private double salary;
    private double coefficient;

    public Manager() {
    }

    public Manager(double salary, double coefficient) {
        this.salary = salary;
        this.coefficient = coefficient;
    }

    public Manager(String name, int birthday, String address, double salary, double coefficient) {
        super(name, birthday, address);
        this.salary = salary;
        this.coefficient = coefficient;
    }

    public Manager(String name, int birthday, String address, double salary, double totalSalary, double salary1, double coefficient) {
        super(name, birthday, address, salary, totalSalary);
        this.salary = salary1;
        this.coefficient = coefficient;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double getTotalSalary() {
        return (this.getSalary() * this.coefficient);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }


    @Override
    public String toString() {
        return "Manager{" +super.toString() +
                "salary=" + getTotalSalary() +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
