//Find a binary value of a number...
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class BinaryFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num to find the binary value of that number :: ");
        int num = sc.nextInt();
        System.out.println("Binary value of %d is : "+ Integer.toBinaryString(num));
    }
}
