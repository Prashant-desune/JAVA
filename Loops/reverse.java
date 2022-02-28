import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;
        for(;number!=0;){
            int d = number%10;
            reverse =reverse*10+d ;
            number = number/10;
        }
        System.out.println(reverse);
    }
}
