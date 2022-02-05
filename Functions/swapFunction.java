import java.util.*;
public class swapFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Num :");
        int first = sc.nextInt();
        System.out.print("Enter the Second Num :");
        int second = sc.nextInt();
        swap(first, second);
    }
    public static void swap(int first, int second){
        int swap = first;
        first = second;
        second = swap;
        System.out.println("After Swapping::");
        System.out.println(first);
        System.out.println(second);

    }
    
}
