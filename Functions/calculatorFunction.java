//
import java.util.*;
public class calculatorFunction {
    public static void calculator(int a, int b){
        int sum = a+b;
        System.out.println("Sum is :"+sum);
        int substract = a-b;
        System.out.println("Substraction is :"+ substract);
        int multiple = a*b;
        System.out.println("Multiplication is: "+ multiple);
        int divide = a/b;
        System.out.println("Division is: "+ divide);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B : ");
        int b = sc.nextInt();
        calculator(a, b);
    }
}