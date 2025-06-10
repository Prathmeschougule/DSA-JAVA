package oop.staticExample;

import javax.sound.midi.MidiChannel;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(12,"rahul",120000,true);
        Human ganesh = new Human(12,"rahul",120000,false);
        System.out.println("The Total Population" + Human.population);
        fun();
    }

//  this the not dependent on the object,not belong  to object
     static  void fun(){

//   greeting();    //you can not use this because it required an instance
//   but this function you are  using it is dose not  depend on  instances


//        you can not acess the  non static stuff without referencing thire instance in
//         static context


//         hence,here I am referancing it
          Main obj= new Main();
          obj.greeting();
     }

//   we know that something is not static, belongs to an object
//    this is the dependent on object
     void  greeting(){
        System.out.println("hellos");
    }
}
