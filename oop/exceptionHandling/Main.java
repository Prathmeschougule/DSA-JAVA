package oop.exceptionHandling;

public class Main {

    public static void main(String[] args) {

        int a = 4;
        int b = 0 ;


         try {

//            divid(a,b);

             String name = "kunal" ;
             if (name.equals("kunal")){
                 throw  new MyException("the name is  kunal ");
             }
         }catch (MyException e ){
             System.out.println(e.getMessage());
         }catch (Exception e ){
             System.out.println(e.getMessage());
         }finally {
             System.out.println("This is the Run Always ");

         }

    }

    static int  divid( int a , int b ){
            if (b == 0 ){
                throw  new ArithmeticException("cant devided by the Zero ");
            }
            int ansdivide = a/b ;
            System.out.println(ansdivide);
            return a/b;

    }
}
