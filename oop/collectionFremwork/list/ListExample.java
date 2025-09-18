package oop.collectionFremwork.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();

        name.add("prakash");
        name.add("ramesh");
        name.add("ragav");
        name.add("parsu");
        name.add("prakash");

        System.out.println("First Name :" + name.get(1));

        System.out.println(name);
    }
}
