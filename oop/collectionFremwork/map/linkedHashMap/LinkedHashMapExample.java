package oop.collectionFremwork.map.linkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> capitalCities= new LinkedHashMap<>();

        capitalCities.put(2, "London");
        capitalCities.put(1, "New Dehli");
        capitalCities.put(null, "Wien");
        capitalCities.put(null, "Oslo");
        capitalCities.put(5, "Oslo"); // Duplicate
        capitalCities.put(6, "Washington DC");

        System.out.println(capitalCities);
    }

}
