public class AddingTwoMatrices {
    public static void main(String[] args) {
        int A [] [] = {
            {1,2,3,4},
            {5,6,7,8},
            {4,5,6,7},
            {7,6,7,8}
        };
        int B [] [] = {
            {1,2,3,4},
            {5,6,7,8},
            {4,5,6,7},
            {7,6,7,8}
        };
        int C [][] = new int [4][4]; //! put the sum of A[i][j]+B[i][j]
        for(int i = 0;i<A.length;i++){
            for(int j = 0; j<A[0].length;j++){
                C [i][j]= A[i][j]+B[i][j];
            }
        }
        for(int x[]:C){
            for(int y : x){
                System.out.format(y+"  ");
            }
            System.out.println("");
        }
    }
}