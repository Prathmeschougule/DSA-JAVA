package oop.interfaceDemo;

public class Car implements  Engine,Break ,Media{
    @Override
    public void brek() {
        System.out.println("Break as a  normal car ");
    }

    @Override
    public void start() {
        System.out.println("Start as a  normal car ");

    }

    @Override
    public void stop() {
        System.out.println("Stop as a  normal car ");


    }

    @Override
    public void acc() {
        System.out.println("acce as a  normal car ");
    }
}
