package LinearSearch;
public class LenearSearch {
    public static void main(String[] args) {
      int[] num={23,43,23,43,32};
     
       int target =43;
      int result= searchLinear(num , target);
      int result2 = searchLinear2(num, target);
      boolean result3= searchLinear3(num, target);
      System.out.println(result);
      System.out.println(result2);
      System.out.println(result3);
    }


    // return the true or false 
    static  boolean searchLinear3(int[] arr,int target){

        if (arr.length==0) {
            return false;   
        }
    
        // run a for loop  every index value
        // return the index value 
    for(int index=0;index<arr.length;index++){

        // check for element at every index if it is = target
        int element=arr[index];

        if (element==target){

            return true;
        }
    }
    return false;
}


    // return the value 

    static int searchLinear2(int[] arr,int target){

        if (arr.length==0) {
            return -1;   
        }
    
        // run a for loop  every index value
        // return the index value 
    for(int index=0;index<arr.length;index++){

        // check for element at every index if it is = target
        int element=arr[index];

        if (element==target){

            return element;
        }
    }
    return Integer.MAX_VALUE;
}


  // return the index value 

    static int searchLinear(int[] arr,int target){

            if (arr.length==0) {
                return -1;   
            }
        
            // run a for loop  every index value
          
        for(int index=0;index<arr.length;index++){

            // check for element at every index if it is = target
            int element=arr[index];

            if (element==target){

                return index;
            }
        }
        return  Integer.MAX_VALUE;
    }
    
}
