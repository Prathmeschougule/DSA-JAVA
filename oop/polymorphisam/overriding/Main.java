package oop.polymorphisam.overriding;
public class Main {
    public static void main(String[] args) {
        Shop obj;
        obj = new Car();
        obj.myBike();
        obj = new Bike();
        obj.myBike();
    }
}
