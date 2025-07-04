package oop.collectionFremwork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//       ArrayList

        ArrayList<Integer> list = new ArrayList<>();

         list.add(12);
         list.add(32);
         list.add(45);
         System.out.println("This is the Array List " + list);

         list.remove(0);
         System.out.println("This is the Array List " + list);

         list.add(0,344);
         System.out.println("This is the Array List " + list);


         list.size();
         System.out.println("This is the Array List " + list);


          if (list.isEmpty()){
              System.out.println("list Is the Empty");
          }
            System.out.println("list Is not Empty ");

          list.clear();
          System.out.println(list);




    }
}
