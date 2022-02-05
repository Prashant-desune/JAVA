//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class greatestNumFunction {
    public static void greaterNum(int a, int b){
        if(a>b){
            System.out.println("A is greater than B");
        }
        else{
            System.out.println("B is greater than A");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num A : ");
        int a = sc.nextInt();
        System.out.print("Enter the number B : ");
        int b = sc.nextInt();
        greaterNum(a, b);
    }
}
