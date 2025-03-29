package Array;

import java.util.Scanner;

public class ArrayOne {
    
    
    public static void main(String[] args) {
        
        // int [] no= new int[4];
        // System.out.println("This is the String Value "+no[1]);

        // String[] str=new String[5];
        // System.out.println("this is String Value "+str[0]);
        
        Scanner in =new  Scanner(System.in);
        int[] arr = new int[5];


        System.out.println("Enter The Values :");
        for(int i = 0 ; i<arr.length; i++){

             arr [i] = in.nextInt();
             
        }
        
        for(int i = 0 ; i<arr.length; i++){

            System.out.print(arr[i] + " ");      
         }

         System.out.print("What the Value OF ths number "+arr[1]);

         System.out.println("Enter the any Number :");
         int j;
          j = in.nextInt();
         boolean found = false;
          for (int i : arr) {

              if (i==j) {
                found=true;
                break;
              }
          }

        if (found) {
            System.out.println("the number is The Found :" + j);
        }
        else{
            System.out.println(j+"the number is not Found");
        }

         
         
    }
}
