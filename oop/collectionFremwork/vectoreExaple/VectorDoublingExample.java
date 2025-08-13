package oop.collectionFremwork.vectoreExaple;

import java.util.Vector;

public class VectorDoublingExample {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>(2);
        System.out.println("initial capacity:" + v.capacity());

//        add element to trigger capacity increase

        v.add(23);
        v.add(43);
        System.out.println("After Adding 2  element :" + v.capacity());

        v.add(34);   // Triggers resize (2 → 4)
        System.out.println("After Adding 3  element :" + v.capacity());

        v.add(40);
        v.add(50); // Triggers resize again (4 → 8)
        System.out.println("Capacity after adding 5 elements: " + v.capacity());
    }
}
