package oop.generics;

public class Wildcard<T extends Number> {

    T[] obje3;

    Wildcard(T[] obje3){
        this.obje3=obje3;

    }

    void  display(){
        for (T  element :  obje3){
            System.out.println("This is your number :" + element);
        }
    }
}
