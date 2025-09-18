package oop.collectionFremwork.set;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> car = new HashSet<String>();

        car.add("Honda");
        car.add("pulser");
        car.add("Suzuki");

        System.out.println("This is ur car : "  + car);

//        Check Element IS present  or Not
        System.out.println(   car.contains("Honda"));

//        Remove Element
        car.remove("Honda");
        System.out.println("This is ur car : "  + car);

//        Clear all Element
//        car.clear();
//        System.out.println(car);

//         size of Element
        System.out.println( car.size());


        for (String i : car){
            System.out.println(i);
        }
    }
}
