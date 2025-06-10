package oop.polymorphisam.overloading;

public class Car {

    String  name ;
    String name2;
    String carType;

    void carName( String name){
        this.name = name;
    }

    void  carName( String name2, String carType){
        this.carType=carType;
        this.name2= name2;
    }

}
