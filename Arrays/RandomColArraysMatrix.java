public class RandomColArraysMatrix {
    public static void main(String[] args) {
        int [][] A = {{1,2,3,4},{2,3},{1,2,3}};
        for(int row = 0;row<A.length;row++){
            for(int col = 0; col<A[row].length;col++){
                System.out.print(A[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
