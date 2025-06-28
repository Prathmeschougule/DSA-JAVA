package oop.generics;

public class GenericMethod {


    // Generic method defined here
    public static <T> void genericDisplay(T[] array){
       for (T element : array){
           System.out.println(element + " ");
       }
    }
}
