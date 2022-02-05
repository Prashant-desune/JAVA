/*Write a program that prompts the user to input a number. 
The program should then output the number and a message saying whether the number is 
positive, negative, or zero.*/

import java.util.*;
public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value :: ");
        double number = sc.nextDouble(); 
        if(number>0){
            System.out.println("The value is Positive : " + number);
        }
        else if(number<0){
            System.out.println("The value is Negative : " + number);
        }
        else{
            System.out.println("The value is Zero : " + number);
        }
    }
}
