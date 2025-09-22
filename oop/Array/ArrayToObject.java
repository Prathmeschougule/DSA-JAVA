package oop.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayToObject {
    
    public static void main(String[] args) {
        
        String[] str = new String[5];
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Name ");

        for(int i =0 ; i < str.length ; i++){
            str[i]=scn.next();
        }

        System.out.println(Arrays.toString(str));


        // modifiction 
        str[1]="prathmesh";
        System.out.println(Arrays.toString(str));
    }
}
