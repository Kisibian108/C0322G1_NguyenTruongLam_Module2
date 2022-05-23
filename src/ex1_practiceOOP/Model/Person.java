package ex1_practiceOOP.Model;

// class cha gom nhung thuoc tinh chung ( ke thua)
public abstract class Person {

    // tinh bao dong thuoc tinh private
    private String name;
    private int birthday;
    private String address;
    private double salary;


    //construtor
    public Person() {
    }

    public Person(String name, int birthday, String address, double salary, double totalSalary) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.salary = salary;

    }

    public Person(String name, int birthday, String address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    //getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract double getTotalSalary();

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                "," ;
    }
}
