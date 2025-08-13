package oop.collectionFremwork.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> car = new LinkedList<>();
        car.add("nano");
        car.add("safari");
        car.add("maruti");
        car.addFirst("First ");
        car.addLast("This is the Last");
        car.removeFirst();
        System.out.println(car);
    }
}
