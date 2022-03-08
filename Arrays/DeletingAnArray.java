import java.util.*;
public class DeletingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int loc;//which location of array is going to be deleted
        int size = sc.nextInt();
        System.out.print("Enter the array elements : ");
        int a[] = new int[size];
        for(int i = 0;i<size;i++){
            a[i]=sc.nextInt();//take the input of the given size
        }
        System.out.print("Enter the array Location : ");
        loc = sc.nextInt();
        for(int i = loc;i<size-1;i++){
            a[i]=a[i+1];
        }
        size--;
        for(int i = 0 ; i<size;i++){
            System.out.println(a[i]);
        }

    }
}
