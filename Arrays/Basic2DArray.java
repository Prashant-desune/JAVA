import java.util.Arrays;

public class Basic2DArray {
    public static void main(String[] args) {
        int A [][] = new int [5][5];
        int B [] [] = {
            {1,2,3,4},
            {5,6,7,8},
            {4,5,6,7},
            {7,6,7,8}
        };
        for(int i = 0;i<B.length;i++){
            for(int j = 0;j<B[0].length;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
