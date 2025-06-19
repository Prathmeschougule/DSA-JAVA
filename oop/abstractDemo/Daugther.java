package oop.abstractDemo;

public class Daugther extends Prent {


    public Daugther(int age, int mark) {
        super(mark);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I From Career");
    }

    @Override
    void yourCareer() {

        System.out.println("I From yourCareer");

    }
}
