// Java Program to Find 3rd Largest Number in an array

public class Array7{
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,7,6,8,9};
        int A = arr[0];
        int B = arr[0];
        int C = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>A){
                B=A;
                A = arr[i];
            }
            else if(arr[i]<A && arr[i]>B){
                B=A;
                C=B;
                B=arr[i];
            }
            else if(arr[i]<B && arr[i]>C){
                C=arr[i];
            }
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}