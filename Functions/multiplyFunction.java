import java.util.*;
public class multiplyFunction {
    public static int product(int a, int b){
        int prod = a * b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number A : ");
        int a  = sc.nextInt();
        System.out.print("Enter the number B : ");
        int b = sc.nextInt();
        int prod = product(a, b);
        System.out.println("The Product of num is::"+ prod);
    }
}
