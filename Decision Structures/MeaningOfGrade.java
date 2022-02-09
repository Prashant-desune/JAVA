/*
Write a program that prompts the user to enter grade. 
Your program should display the corresponding meaning of grade as per the following table
*/
import java.util.*;
public class MeaningOfGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the grade : ");
        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Deficient");
                break;
            case 'E':
                System.out.println("Failing");
                break;
            default:
            System.out.println("Invalid Input");
        }
    }
}
