/* Write a program to enter the numbers till the user wants and at the end the program should display the largest 
and smallest numbers entered. */

import java.util.*;
public class larestOrSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        char choice;
        do{
            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);
        }
        while(choice=='Y'|| choice=='Y');
        System.out.println("Largest Num : " + max);
        System.out.println("Smallest Num : " + min);
    }
}
