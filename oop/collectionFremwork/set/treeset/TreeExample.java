package oop.collectionFremwork.set.treeset;

import java.util.TreeSet;

public class TreeExample {
    public static void main(String[] args) {

        TreeSet<User> users = new TreeSet<>();

        User user = new User("rahul" , 32);

        users.add(new User("Ganesh",34));
        users.add(user);

        System.out.println(users);

        TreeSet<Integer>number = new TreeSet<>();

        number.add(23);
        number.add(45);
        number.add(2);

        System.out.println(number);
    }
}
