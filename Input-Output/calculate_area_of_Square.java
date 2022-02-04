/*  
Question: - Find the area of a Square
*/
import java.util.*;
public class calculate_area_of_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side value: ");
        double side = sc.nextDouble();
        double area = side*side;
        System.out.println("Area of a square is :  " + area);
    }
}