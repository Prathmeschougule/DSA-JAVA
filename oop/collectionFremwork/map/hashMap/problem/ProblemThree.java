package oop.collectionFremwork.map.hashMap.problem;

import java.util.HashMap;

public class ProblemThree {
    public static void main(String[] args) {

        HashMap<Integer,String> foodOne = new HashMap<>();

        foodOne.put(1,"Banana");
        foodOne.put(2,"Apple");
        foodOne.put(3,"Caret");

        System.out.println(" List of Food  "+foodOne);

        foodOne.clear();

        if (foodOne.isEmpty()){
            System.out.println("This is the empty");
        } else {
            System.out.println(foodOne);
        }
    }
}
