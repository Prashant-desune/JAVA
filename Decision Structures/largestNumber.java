/*Write a program that asks the user to enter a numbers 
in three variables and then displays the largest number.
*/
import java.util.*;
public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the frist value : ");
        int first = sc.nextInt();
        System.out.print("Enter the second value : ");
        int second = sc.nextInt();
        System.out.print("Enter the third value : ");
        int third = sc.nextInt();
        if(first>second && first>third){
            System.out.println("greatest value is : "+first);
        }
        else if(second>first && second>third){
            System.out.println("greatest value is : "+second);
        }
        else{
            System.out.println("greatest value is : "+third);
        }
    }
}
