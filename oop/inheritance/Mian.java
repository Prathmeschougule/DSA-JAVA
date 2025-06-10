package oop.inheritance;

public class Mian {
    public static void main(String[] args) {

//        Box obj = new Box(23,34,54);
//        Box obj1 = new Box(obj);
//        System.out.println(obj1.h  + " " +  obj1.w + " " + obj1.l);

//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.weight + " " + box3.w);

        BoxWeight box4 = new BoxWeight(12,32,34,32);
        System.out.println(box4.h+"" + box4.l + box4.w + " " + box4.weight);

        Box box5 = new BoxWeight(23,32,34,23);
//       System.out.println(box5.h+"" + box5.l + box5.w + " " + box5.weight);
        System.out.println(box5.w);

        BoxWeight box6 = new BoxWeight(23,"reaga");
        System.out.println(box6.quantity + " " + box6.name);


    }
}
