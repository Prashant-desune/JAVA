//Armstrong Number
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = num;
        int arm = 0;
        while(num!=0){
            int d = num%10;
            arm = (d*d*d)+arm;
            num = num/10;
        }
        if(num2==arm){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
