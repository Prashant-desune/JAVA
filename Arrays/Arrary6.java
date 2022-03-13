//Java Program to sort the elements of an array in desending order
public class Arrary6 {
    public static void main(String[] args) {
        int arr[] = {1,3,5,13,56,87,98,45,23,45,6,4,57,76};
        int temp = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
