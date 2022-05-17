package ss9_ArrayListLinkedList.Exercise.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

    public interface MyList<E> extends Iterable<E> {
        void add(E e);

        void add(int index, E e);

        void clear();

        boolean contains(E e);

        E get(int index);

        int indexOf(E e);

        boolean isEmpty();

        int lastIndexOf(E e);

        boolean remove(E e);

        E remove(int index);

        Object set(int index, E e);

        int size();
    }


