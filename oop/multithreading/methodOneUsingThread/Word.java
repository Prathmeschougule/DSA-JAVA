package oop.multithreading.methodOneUsingThread;

public class Word extends Thread {
    @Override
    public void run() {
        System.out.println("word");
        System.out.println(Thread.currentThread().getName());
    }
}
