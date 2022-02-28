//Java program to calculate power of a Number 
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result=1;
        int num = sc.nextInt();
        int pow = sc.nextInt();
        for(int i = 1; i<=pow;i++){
            result = num*result;
        }
        System.out.println(result);
    }
}
