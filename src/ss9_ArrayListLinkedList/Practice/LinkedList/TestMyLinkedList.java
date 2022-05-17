package ss9_ArrayListLinkedList.Practice.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(5);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(3,1);
//        ll.add(9);
        ll.printList();

        List<Integer> list = new LinkedList<>();
        list.add(6);
        list.add(7);
        list.add(5);
        list.add(3,8);
        list.add(4,8);
        for (int i = 0; i < list.size(); i++) {
            System.err.println("index: " + i+ " : " + list.get(i));
        }
    }
}
