public class RotatingAnArrayLeftShift {
    public static void main(String[] args) {
        int A [] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int temp = A[0];
        for(int i = 1;i<A.length;i++){ //traverse the array
            A[i-1]=A[i];//minus the position
        }
        A[A.length-1]=temp;//Add the first position to the last like A[0]= 1 now be A[11]= 1;
        for(int x : A)
        System.out.print(x+" ");
        System.out.println("");
    }
}