import java.util.*;
public class PraArrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        System.out.print("Enter the Size of Arrays : ");
        int size = sc.nextInt();
        System.out.print("Enter the elements of arrays : ");
        for(int i = 0;i<size;i++){
            num[i] = sc.nextInt();
        }
        //Insersection 
        System.out.print("Enter the value need to insert : ");
        int x = sc.nextInt();
        System.out.print("At what Position : ");
        int pos = sc.nextInt();
        for(int i = size;i>pos;i--){
            num[i] = num[i-1];
        }
        num[pos]= x;
        for(int i = 0 ; i<=size;i++){
            System.out.print(num[i]);
            System.out.println("");
        }
    }
}