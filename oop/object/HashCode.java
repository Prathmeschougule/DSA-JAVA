package oop.object;


public class HashCode {
     private  int num ;


    public HashCode(int num) {
        this.num = num;

    }
    public static void main(String[] args) {

        HashCode obj =  new HashCode(78);
        HashCode obj1 =  new HashCode(23);

        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());

    }
}
// hashcode : this is method dcome fromt the object class and this method  Basically hashcode give the randome  number