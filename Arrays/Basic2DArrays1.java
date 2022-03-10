import java.util.Arrays;

public class Basic2DArrays1 {
    public static void main(String[] args) {
        int A [][] = new int [5][5];
        int B [] [] = {
            {1,2,3,4},
            {5,6,7,8},
            {4,5,6,7},
            {7,6,7,8}
        };
        //! <-- USING FOR EACH LOOP -->
        for(int x[] : B){
            for(int y : x){
                System.out.print(y+ " ");
            }
            System.out.println("");
        }
    }
}
