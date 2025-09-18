package oop.collectionFremwork.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortLambdaExample {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(5, 2, 9, 1, 7);

        number.sort( (a,b)-> a-b);
        System.out.println("Assending" + number);

        number.sort( (a,b)-> b- a);
        System.out.println("Desending" + number);
    }

}
