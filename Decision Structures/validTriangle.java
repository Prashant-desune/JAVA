/*
A triangle is valid if the sum of all the three angles is equal to 180 degrees.
 Write a program that asks the user to enter three integers as angles and 
 check whether a triangle is valid or not.
*/
import java.util.*;
public class validTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of angle1 : ");
        double angle1 = sc.nextDouble();
        System.out.print("Enter the value of angle2 : ");
        double angle2 = sc.nextDouble();
        System.out.print("Enter the value of angle3 : ");
        double angle3 = sc.nextDouble();
        
        if((angle1+angle2+angle3)==180){
            System.out.println("It's a Valid Triangle");
        }
        else{
            System.out.println("It's not a Valid Triangle");
        }
    }
}
