package oop.collectionFremwork.map.hashMap;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {



        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Ajara", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

//        we get the
          System.out.println("this is the kay : " + capitalCities.get("India"));

//        remove the Item
        System.out.println("Remove this item :" + capitalCities.remove("India"));
        System.out.println(capitalCities);

//        iterate the data

        System.out.println("This is the Key set");

        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }

        for(String i : capitalCities.values()){
            System.out.println(i);
        }

        for(String i : capitalCities.keySet()){
            System.out.println(i + "= " + capitalCities.get(i));
        }
     }
}
