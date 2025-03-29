package LinearSearch;

public class FindMin {
     public static void main(String[] args) {
        int [] num={12,232,12,2,3,32,1};
        System.out.println(min(num));

     }

     static int  min( int [] num){

        int min= num[0];

        for(int i=1 ;i< num.length;i++){

            if (num[i]<min) {
                
                min=num[i];
            }

        }

        return  min;

     }
        
        
     

}
