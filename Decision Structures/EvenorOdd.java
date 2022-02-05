//Q. Write a program that asks the user to enter a number and displays whether entered number is an odd number or even number.

import java.util.*;
public class EvenorOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();//input by user
        if(num % 2 ==0){
            System.out.println("It's a Even Number");
        }
        else{
            System.out.println("It's a Odd Number");
        }
    }
}