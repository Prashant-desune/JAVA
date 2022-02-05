// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
public class circumferenceCircle {
    public static void circle(Double radius){
        double circumference = (2*22*radius)/7;
        System.out.println("The circumference of a circle is :" +circumference);   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :");
        double radius = sc.nextDouble();
        circle(radius);
    }
}