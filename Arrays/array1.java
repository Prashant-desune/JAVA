//! Java Program to copy all elements of one array into another array

public class array1 {
    public static void main(String[] args) {
        int A[] = {1,2,33,44,55,66,78,89};
        int B[] = new int[8];
        for(int i = 0; i<A.length;i++){
            B[i]=A[i];
        }
        for(int x : B){
            System.out.println(x);
        }
    }
}
