
public class IncSizeOfArray {
    public static void main(String[] args) {
        int A [] = {1,2,3,4,5,6,7};
        System.out.println(A.length);
        int B[] = new int  [2*A.length];
        for(int i = 0;i<A.length;i++){
            B[i] = A[i];//copy the array in the Bth Array
        }
        A = B;
        B=null;
        System.out.println(A.length);

    }
}
