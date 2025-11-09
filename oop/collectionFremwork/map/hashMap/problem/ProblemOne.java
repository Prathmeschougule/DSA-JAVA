package oop.collectionFremwork.map.hashMap.problem;

import java.util.HashMap;

public class ProblemOne {


// problem :   Copy Mappings to Another Map


    public static void main(String[] args) {

        HashMap<Integer,String> foodOne = new HashMap<>();
        HashMap<Integer,String> foodTwo = new HashMap<>();

        foodOne.put(1,"Banana");
        foodOne.put(2,"Apple");
        foodOne.put(3,"Caret");

        foodTwo.put(4,"apple");
        foodTwo.put(5,"apple");
        foodTwo.put(6,"apple");

        System.out.println(foodOne  + " " + foodTwo);

        foodTwo.putAll(foodOne);

        System.out.println(foodTwo);

    }
}
