package LinearSearch;

import java.util.Arrays;

public class SearchInString {
     
    public static void main(String [] args){
 
        String name = "Prathmesh";
        char target='o';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    } 
    

      

// the string give in array  format 

    static boolean search2( String  str, char target){

        if (str.length()==0) {

            return false;
        }

     for (char ch : str.toCharArray()) {
        if (ch==target) {
             return true;
        }
     }
        return false;
    }


//  find the char  

     static boolean  search( String str , char target){
        if (str.length() == 0) {
            return false;
        }

        for (int i =0; i<str.length();i++) {

            if (target== str.charAt(i)) {

             return true;
            }
            
        }

         return false;
     }
}
