import java.util.*;
public class primeNum {
    public static void primeNumber(int n){
        int flag  = 0;
        for(int i = 2; i<= n; i++){
            if(n%i==0){
                flag += 1; 
            }
        }
        if(flag==1){
            System.out.println("Yes It's a prime number");
        }
        else{
            System.out.println("No It's Not a prime Number");
        }
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n  = sc.nextInt();
        primeNumber(n);
    }
}
