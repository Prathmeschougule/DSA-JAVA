package oop.collectionFremwork.map.hashMap.problem;

import java.util.HashMap;

public class ProblemTwo {

//   Problem :  Remove All Mappings from Map
public static void main(String[] args) {

    HashMap<Integer,String> foodOne = new HashMap<>();

    foodOne.put(1,"Banana");
    foodOne.put(2,"Apple");
    foodOne.put(3,"Caret");

    System.out.println(" List of Food  "+foodOne);

    foodOne.clear();

    System.out.println(foodOne);
}
}
