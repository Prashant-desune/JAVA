public class InsertingAnArray {
    public static void main(String[] args) {
        int A [] = new int[10];//created A new memory in Heap 
        A[0]=2;A[1]= 4; A[2]=8;A[3]=9;A[4]=10;A[5]=7;
        int n = 6;//Size of the Array
        int index = 3;//At index num
        int x = 17;//Value want to put  in Array
        for(int i = n;i>index;i--){
            A[i]=A[i-1];
        }
        A[index]=x;
        for(int i = 0;i<n;i++){
            System.out.print(A[i]);
            System.out.println(" ");
        }
    }
}
