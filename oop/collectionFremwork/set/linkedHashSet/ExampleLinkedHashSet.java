package oop.collectionFremwork.set.linkedHashSet;

import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Volvo");
        linkedHashSet.add("BMW");
        linkedHashSet.add("Ford");
        linkedHashSet.add("BMW");  // Duplicate
        linkedHashSet.add("Mazda");

        System.out.println(linkedHashSet);

//        Loop Through a LinkedHashSet

         for (String car : linkedHashSet){
             System.out.println(car);
         }

        linkedHashSet.clear();
        System.out.println(linkedHashSet);

        for (String car : linkedHashSet){
            System.out.println(car);
        }

//        size of linkedhashset

        System.out.println(linkedHashSet.size());


//        Use contains() to check for an element:

        System.out.println(linkedHashSet.contains("BMW"));

//        remove the element

        linkedHashSet.remove("Volvo");

        System.out.println(linkedHashSet);

//        Remove All Elements


    }
}
