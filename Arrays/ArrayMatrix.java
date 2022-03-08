import java.util.*;
public class ArrayMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][] A = new int[3][3];
        System.out.println("Size of the rowArray is : "+A.length);
        //This is done for the input stuf
        for(int row = 0; row<A.length;row++){
            for(int col = 0; col<A[row].length;col++){
                A[row][col]=sc.nextInt();//Input the Value of the Matrix
            }
        }
        //This is done for the output stuff
        //use for each loop
        for(int[] num : A){
            System.out.println(Arrays.toString(num));
        }
    }
}
