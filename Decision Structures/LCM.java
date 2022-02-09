//Java Program to Find LCM of two Numbers
import java.util.*;
public class LCM{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the first num:: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second num:: ");
        int b = sc.nextInt();
        int h = 1;
        for(int i = 1; i<=a;i++){
            if(a%i==0 && b%i==0){
                h = i;
            }
        }
        int lcm = (a*b)/h;
        System.out.printf("The LCm of %d and %d is : ", a,b);
        System.out.println(lcm);
    }
}