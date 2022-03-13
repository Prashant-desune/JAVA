//Java Program to print the duplicate elements of an array
public class array4 {
    public static void main(String[] args) {
        int A[] = {1,2,1,3,2,4,5,6,3,5,6,4,9,10,11,12};
        for(int i = 0;i<A.length;i++){
            for(int j = i+1;j<A.length;j++){
                if(A[i]==A[j]){
                    System.out.println(A[j]);
                }
            }
        }
    }
}
