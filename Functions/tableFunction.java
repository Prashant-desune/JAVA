//Make a function to print the table of a given number n.
import java.util.*;
public class tableFunction {
    public static void tableFunctionN(int n){
        for(int i = 1; i<=10; i++){
            int table = n*i;
            System.out.println(n+"x"+i+"="+table);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        tableFunctionN(n);
    }
}
