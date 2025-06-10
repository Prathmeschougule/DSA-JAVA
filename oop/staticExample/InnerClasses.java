package oop.staticExample;



public class InnerClasses {

   static  class Test{
        static String name ;

        public Test(String name ){
            this.name = name ;
        }

    }


    public static void main(String[] args) {
        Test obj = new  Test( "Raju");
        Test  obj2 = new Test("kiran");

        System.out.println(obj.name);
        System.out.println(obj2. name);

    }
}
