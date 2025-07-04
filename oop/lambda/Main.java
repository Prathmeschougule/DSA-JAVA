package oop.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//       Simple

        LambdaExpression g = () -> System.out.println("This is the Lambda Function Example");
        g.sayHello();

//        Calculate

        Calculate add = (a,b) -> a + b ;

        Calculate mul = (a,b) -> a * b ;
        System.out.println("The Addition : " +  add.multiplication(12,32));
        System.out.println("The Multiplication :" + mul.multiplication(23,34));


//        with List array

        List<Integer> list = new ArrayList<>();

        System.out.println("This is the My Array list ");
        for (int i = 0 ; i < 5 ; i ++){
            list.add(i+1);

        }
        System.out.println(list);

        List<Integer> sortList = list.stream()
                .filter(n -> n % 2 == 0 )
                .toList();

        System.out.println("This is the Sorted List ");
        System.out.println(sortList);

        list.forEach( n -> System.out.println("Number" + " "+  n));



    }
}
