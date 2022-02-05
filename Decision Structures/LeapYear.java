//Q.Any year is input by the user. Write a program to determine whether the year is a leap year or not.

//!Briefly Hint
//! Leap Years are any year that can be evenly divided by 4. 
//! A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.


import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        if((year%4==0) && ((year%100!=0) || (year%400==0))){ 
            System.out.println("It's A Leap year");
        }
        else{
            System.out.println("It's Not A Leap Year");
        }
    }
}
