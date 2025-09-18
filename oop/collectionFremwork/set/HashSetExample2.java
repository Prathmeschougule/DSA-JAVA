package oop.collectionFremwork.set;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {

//         first create hashset
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(12);
        numbers.add(23);
        numbers.add(10);

        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }

    }
}
