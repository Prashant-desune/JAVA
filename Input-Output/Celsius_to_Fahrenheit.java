/*
Question :- Write a program that asks for a temperature in Celsius and prints out the 
temperature in Fahrenheit. Use InputBox for input and OutputBox for output. 
*/


/*
The formula to convert Celsius to the equivalent Fahrenheit is:
fahrenheit = 1.8 x celsius + 32
*/


import java.util.*;
public class Celsius_to_Fahrenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value in Celsius: ");
        double Celsius = sc.nextDouble();
        double Fahrenheit = (1.8*Celsius)+32;
        System.out.println("Value in Fahrenheit" + Fahrenheit);
    }
}
