//Java Program to left rotate the elements of an array
public class Array3 {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8,9};
        int temp = A[0]; 
        for(int i = 1; i<A.length;i++){
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        for(int X : A){
            System.out.print(X);
            System.out.println("");
        }
    }
}
