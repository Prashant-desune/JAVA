//java fibonacci Series

import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int firstnum = 0;
        int secondnum = 1;
        int nextnum = 0;
        System.out.print(firstnum+ " ");
        System.out.print(secondnum+ " ");
        for(int i = 2; i<=num;i++){
            nextnum = firstnum+secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
            System.out.print(firstnum+ " ");
        }
    }
}
