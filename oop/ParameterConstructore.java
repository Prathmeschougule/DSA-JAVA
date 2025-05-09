package oop;

public class ParameterConstructore {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 23);
        car.Display();

    }
}


class Car{

    String name;
    int prize;

//    parameterized constructor

//    this word is special key word  refear to the current object
//    this key word is declerd in the inside the method
//    car.name=carName replace to this.name=carName

    Car(String carName, int carPrise){
        this.name = carName;
        this.prize = carPrise;
    }

    void Display(){
        System.out.println(name + " " + prize);
    }

}