package ss11_StackQueue.Exercise.Personal;

public class Person implements Comparable<Person> {
    private String name;
    private boolean gender;
    private int date;

    public Person(String name, boolean gender, int date) {
        this.name = name;
        this.gender = gender;
        this.date = date;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.date > o.date) {
            return 1;
        } else if (this.date < o.date) {
            return -1;
        } else {
            return 0;
        }
    }
}



