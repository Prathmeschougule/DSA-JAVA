package oop.multithreading.methodTwoUsingRunnble;

import com.sun.source.tree.NewArrayTree;
import oop.multithreading.methodOneUsingThread.Word;

public class TestMultithreading {
    public static void main(String[] args) {


        SecondThread s = new SecondThread();

        Thread t1 = new Thread(s);

//        t1.run();
        t1.start();

        System.out.println("Hello...?");
    }
}
