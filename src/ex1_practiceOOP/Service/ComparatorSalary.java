package ex1_practiceOOP.Service;

import ex1_practiceOOP.Model.Person;

import java.util.Comparator;

public class ComparatorSalary implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getTotalSalary() > o2.getTotalSalary()) {
            return 1;
        } else if (o1.getTotalSalary() < o2.getTotalSalary()) {
            return -1;
        } else {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
