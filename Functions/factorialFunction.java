//Find the factorial using Function.

import java.util.*;
public class factorialFunction {
    public static int factorial(int n){
        if(n<0){
            System.out.println("Invalid Input");
        }
        int factorial = 1;
        for(int i= n ; i>=1;i--){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value To get factorial::");
        int n = sc.nextInt();
        System.out.println("The factorial of the"+n+"Input is::"+factorial(n));
    }
}
