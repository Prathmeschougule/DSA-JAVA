package oop.interfaceDemo;

public interface Shop {

    default void  mobile(){
        System.out.println("this is the mobile Shop ");
    }

    static  void computer(){
        System.out.println( "this is the Copmuter ");
    }

    void tab();
}
