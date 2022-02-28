//Num is Prime or Not
import java.util.*;
public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag = 0;
        for(int i = 2; i<=num;i++){
            if(num%i==0){
                flag +=1;
            }
        }
        if(flag==1){
            System.out.println("Prime num");
        }
        else{
            System.out.println("not prime ");
        }
    }
}
