/*If a triangle has side lengths a,b,c, then the formula for 
the area of the triangle is area = √s(s − a)(s − b)(s − c), 
where s = (a + b + c)/2.*/

/* Question:- Write a program that asks the user to enter three sides of triangle. 
The program should compute and display the area of triangle. */

import java.util.*;
public class Area_of_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of side1: ");
    int side1 = sc.nextInt();
    System.out.print("Enter the value of side2: ");
    int side2 = sc.nextInt();
    System.out.print("Enter the value of side3: ");
    int side3 = sc.nextInt();
    double  s = (side1 + side2 + side3)/2;
    double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    System.out.println("Area Of The Triangle is::"+area);
    
    }
}
