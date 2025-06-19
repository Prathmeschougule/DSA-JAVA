package oop.abstractDemo;

public abstract class Prent {
     int  mark;
     int age ;
     abstract void career();
     abstract void yourCareer();

      public  Prent  (int mark ){
          this.mark = mark;
           System.out.println(mark);
     }
      static void display(){
           System.out.println("hello");
     }

     void  normal(){
          System.out.println("this is the Normal method ");
     }
}
