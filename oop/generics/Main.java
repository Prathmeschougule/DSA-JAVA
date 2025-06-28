package oop.generics;
import java.nio.file.Watchable;

import static oop.generics.GenericMethod.genericDisplay;

public class Main {


    public static void main(String[] args) {

//    instance of the integer type
        Test<Integer> iObje= new Test<Integer>(78);
        System.out.println(iObje.obj);

        //        instance of the integer type

        Test<String> sObj= new Test<>("This is the Test Class ");
        System.out.println(sObj.obj);



//        Multiple parameters

        MultipleParameters<Integer,String> objeMul= new MultipleParameters<Integer,String>(34,"Prathmesh");
        objeMul.print();


//       Generic method defined here

        Integer[] intArray ={23,34,54,65,45,34};
        String[] intString={"raj","namdev","mahan"};

        genericDisplay(intArray);
        genericDisplay(intString);

//        wildCard Example

        Integer[] inArray = { 12,32,34,32,43,23};
        Wildcard<Integer> num =  new Wildcard<>(inArray);
        num.display();
    }


}
