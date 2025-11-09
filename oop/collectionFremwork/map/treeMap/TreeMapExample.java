package oop.collectionFremwork.map.treeMap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer,String> capitalCities = new TreeMap<>();

        capitalCities.put(2, "London");
        capitalCities.put(1, "New Dehli");
        capitalCities.put(4, "Wien");
        capitalCities.put(3, "Oslo");
        capitalCities.put(5, "Oslo"); // Duplicate
        capitalCities.put(6, "Washington DC");
        System.out.println(capitalCities);
    }
}
