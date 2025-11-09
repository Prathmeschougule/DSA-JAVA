package oop.multithreading.methodOneUsingThread;

public class Test {
    public static void main(String[] args) {

        Word word = new Word();

        word.start();
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
    }
}

