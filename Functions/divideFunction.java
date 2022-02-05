import java.util.*;
public class divideFunction {
    public static double divideCalculate(double a, double b){
        double divide = a/b;
        return divide;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number A : ");
        double a = sc.nextDouble();
        System.out.print("Enter the number B : ");
        double b = sc.nextDouble();
        double divide = divideCalculate(a, b);
        System.out.println("The Output is:: " + divide);
    }
}
