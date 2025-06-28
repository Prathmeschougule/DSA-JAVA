package oop.interfaceDemo;

public class Main {
    public static void main(String[] args) {

//        Example one

        Car car =  new Car();
        car.brek();
        car.start();
        car.stop();
        car.acc();
        car.enginPrise();

//        Example two
        Shop shop = new Accesoris();
        shop.mobile();
        shop.tab();

        Shop.computer();


    }
}
