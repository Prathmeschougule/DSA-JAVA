package oop.objectColning;

import javax.print.attribute.standard.MediaSize;

public class Human implements  Cloneable {

    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(Human  other ) {
        this.name = other.name;
        this.age = other.age;
    }

    public  Object clone() throws  CloneNotSupportedException {
        return  super.clone();
    }
}