//Write a program to calculate HCF of Two given number.

import java.util.*;
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int h = 1;
        for(int i = 1;i<=n && i<=m;i++){
            if(n%i == 0 && m%i == 0){
                h = i;
            }
        }
        System.out.println("HCF of n and m is : " + h);
    }
}
