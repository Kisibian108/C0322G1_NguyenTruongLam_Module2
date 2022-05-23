package ex1_practiceOOP.Model;


public class Operator extends Person {

    private int workingDay;

    public Operator() {
    }

    @Override
    public double getTotalSalary() {
        return this.workingDay * 120000;
    }

    public Operator(int workingDay) {
        this.workingDay = workingDay;
    }

    public Operator(String name, int birthday, String address, int workingDay) {
        super(name, birthday, address);
        this.workingDay = workingDay;
    }

    public Operator(String name, int birthday, String address, double salary, double totalSalary, int workingDay) {
        super(name, birthday, address, salary, totalSalary);
        this.workingDay = workingDay;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }

    @Override
    public String toString() {
        return "Operator{" + super.toString() +
                "workingDay=" + workingDay + "salary: " + getTotalSalary() +
                '}';
    }
}

