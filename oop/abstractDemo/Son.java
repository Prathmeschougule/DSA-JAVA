package oop.abstractDemo;

public class Son extends Prent {

    public Son(int age ,int mark) {
        super( mark);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("hello son ");
    }

    @Override
    void yourCareer( ) {
        System.out.println("hello by ");
    }
}
