//Odd Even Program in Java 
import java .util.*;
public class SumOfOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int Num = sc.nextInt();
        if(Num%2==0){
            for(int i = 0 ; i<=Num;i+=2){
                sum = sum+i;
            }
            System.out.println(sum);
        }
        else{
                for(int i = 1;i<=Num; i+=2){
                    sum = sum + i;
                }
                System.out.println(sum);
        }
    }
}