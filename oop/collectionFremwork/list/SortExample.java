package oop.collectionFremwork.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();

        name.add("ram");
        name.add("radha");
        name.add("sham");

//        sort in ascending  order
        Collections.sort(name);


        System.out.println("sort in ascending order "+name);

        Collections.sort(name,Collections.reverseOrder());

        System.out.println("sort in deascending order "+name);
    }
}
