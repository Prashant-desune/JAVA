import java.util.*;
public class sumFunction {
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number A : ");
        int a = sc.nextInt();
        System.out.print("Enter the number B :");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("The value of a and b is : " + sum);
    }
}
