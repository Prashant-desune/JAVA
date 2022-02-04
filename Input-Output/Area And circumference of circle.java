/*Write a program that inputs from the user the radius of a circle as an integer and prints the circle’s circumference and
 area using the predefined constant Math.PI. Use the following formulas (r is the radius):
circumference = 2πr
area = πr^2 */

import java.util.*;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius::");
        double r = sc.nextDouble();
        double area = (22*r*r)/7;
        double circumference = (2*22*r)/7;
        System.out.println("The area of a Circle is :: "+ area );
        System.out.println("The circumference of a Circle is :: "+ circumference );
    }
}

