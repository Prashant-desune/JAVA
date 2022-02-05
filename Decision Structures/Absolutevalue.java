//Write a program that asks the user to enter a number and displays the absolute value of that number.
import java.util.*;
public class Absolutevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:");
        int number = sc.nextInt();
        if(number<0){
            number = -number;
        }
        System.out.println("Absolute value: " + number);
    }
}

/* 
Enter The Number:-200
Absolute value: 200
*/