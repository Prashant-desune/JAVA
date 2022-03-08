/**
 * FindNumInArray
 */
import java.util.*;
public class FindNumInArray {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int A[] = new int[size];
        System.out.print("Enter the size of an array : ");
        for(int i = 0;i<size;i++){
            A[i]= sc.nextInt();
        }
        System.out.print("Enter the 'X' num want to found in an array : ");
        int x = sc.nextInt();
        for(int i = 0;i<A.length;i++){
            if(x==A[i]){
                System.out.println("X found at index no : "+i);
            }
        }  
    }
}