//Question - Make a function to check if a given number n is even or not.
import java.util.*;
public class evenOrNotFunction {
    public static void evenOrNot(int n){
        if(n%2==0){
            System.out.println("Even Num");
        }
        else{
            System.out.println("Odd Num");
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        evenOrNot(n);
    }
}
