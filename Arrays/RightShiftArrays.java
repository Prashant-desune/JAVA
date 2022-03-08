import java.util.Arrays;

public class RightShiftArrays {
    public static void main(String[] args) {
        int A [] = {1,2,3,4,5};
        int temp = A[4];
        int last = A[A.length-1]; 
        for(int i = temp-1;i>0;i--){
            A[i] = A[i-1];
        }
        A[0]=last;
        System.out.println(Arrays.toString(A));
    }
}