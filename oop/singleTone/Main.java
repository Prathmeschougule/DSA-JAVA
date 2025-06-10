package oop.singleTone;

public class Main {

    public static void main(String[] args) {
        SingleTone obj = SingleTone.getInstance();
        SingleTone obj2 = SingleTone.getInstance();
        SingleTone obj3 = SingleTone.getInstance();


    }
}
