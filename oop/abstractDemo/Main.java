package oop.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(34 ,565) ;
        Daugther daugther = new Daugther(45,45);
        Prent.display();



        son.career();
        son.yourCareer();
        son.normal();
        System.out.println("age" + son.age);



        daugther.career();
        daugther.yourCareer();
        System.out.println("age" + daugther.age);
    }
}
