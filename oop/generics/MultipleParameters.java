package oop.generics;

public class MultipleParameters<T,U> {

    T  obj1;
    U obj2;

    MultipleParameters (T obj1 , U obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }


    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

}
