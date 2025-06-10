package oop.polymorphisam.overloading;

public class Main {
    public static void main(String[] args) {

        Car obj = new Car();
        obj.carName("tavera");
        obj.carName("Maruti","Sujuki");
        System.out.println( obj.name);
        System.out.println( obj.name2 + " " + obj.carType);
    }
}
