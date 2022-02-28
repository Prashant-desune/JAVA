//Palindrom Number or not
import java.util.*;
public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = num;
        int sum = 0;
        while(num>0){
            int d = num%10;
            sum = sum*10+d;
            num = num/10; 
        }
        if(num2==sum){
            System.out.println("Yes it's a Palindrom Number");
        }
        else{
            System.out.println("No it's Not a Palindrom Number");
        }
    }
}
