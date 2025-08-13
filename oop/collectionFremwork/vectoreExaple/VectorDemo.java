package oop.collectionFremwork.vectoreExaple;

import java.util.Vector;

public class VectorDemo {

            public static void main (String [] args){

//              Create A Vector
                Vector<Integer> v = new Vector<>(3);

//              Add element In the Vector
                v.addElement(12);
                v.addElement(32);
                v.addElement(54);

                System.out.println(v);

//               insert the element at index
                v.insertElementAt(34,0);

                System.out.println(v);

//               Remove the Element index
                v.removeElement(54);

                System.out.println(v);


//                print the element of the  vectore
                for (int i : v ){
                    System.out.println(i);
                }

            }

}
