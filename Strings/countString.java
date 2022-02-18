//Java Program to count the total number of characters in a string...countString
import java.util.*;
public class countString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the string : ");
        String str = sc.next();
        int Count = str.length();
        System.out.println("The Count of Given Input is :: " + Count);
    }
}