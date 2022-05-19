package ss11_StackQueue.Exercise.Personal;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Lam", true, 1999));
        list.add(new Person("Linh", true, 1987));
        list.add(new Person("Hien", false, 1989));
        list.add(new Person("Hoai", false, 1992));
        Collections.sort(list);

        for (Person x : list) {
            System.out.println(x);
        }
        Queue<Person> queueGirl = new LinkedList<>();
        Queue<Person> queueBoy = new LinkedList<>();

        for (Person x : list) {
            if (!x.isGender()) {
                queueGirl.add(x);
            } else {
                queueBoy.add(x);
            }
        }

        Queue<Person> person = new LinkedList<>();
        while (!queueGirl.isEmpty()) {
            person.add(queueGirl.poll());
        }
        while (!queueBoy.isEmpty()) {
            person.add(queueBoy.poll());
        }
        System.out.println("Sau khi sap xep: ");
        for (Person x : person) {
            System.out.println(x);
        }
    }
}

