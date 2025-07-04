package oop.objectColning;

public class Main {
    public static void main(String[] args)  throws  CloneNotSupportedException {

        Human human = new Human("Kunal",23);
//        Human human1 = new Human(human);

        Human twin = (Human)human.clone();
        System.out.println(twin.age+ " " + twin.name);
    }
}
