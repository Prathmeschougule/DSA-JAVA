package problems.pattern;

//Zero-One Triangle Pattern

//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1
//0 1 0 1 0 1


public class Pt4 {
    public static void main(String[] args) {

        int i , j ;

        for (i = 1 ; i <= 6; i++){

            for (j = 1; j <= i ; j++){

                int n = i+j;

                if (n % 2 == 0){
                    System.out.print( 1 + " ");
                } else {
                    System.out.print( 0 + " ");
                }
            }
            System.out.println();
        }
    }
}