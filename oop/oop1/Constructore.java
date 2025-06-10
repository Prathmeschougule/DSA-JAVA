package oop.oop1;

public class Constructore {
    public static void main(String[] args) {
        Student student = new Student();

//        System.out.println(student.name);
//        System.out.println(student.roll);

    }

}


class Student{

    String name  = "rahule";
    int roll = 34;

//    create a constructor
      Student(){
            System.out.println( name + " " + roll);
      }

}
