import java.util.*;
public class DeletionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        System.out.print("Enter the size of Array : ");
        int size = sc.nextInt();
        System.out.print("Enter the Elements of arrays : ");
        for(int i = 0; i<size;i++){
            num[i] = sc.nextInt();
        }
        //Deletion
        System.out.print("Enter the position want to be deleted : ");
        int pos = sc.nextInt();
        for(int i = pos;i<size;i++){
            num[i]=num[i+1];
        }
        --size;
        for(int i = 0 ; i< size;i++){
            System.out.print(num[i]);
            System.out.println("");
        }

    }
}
