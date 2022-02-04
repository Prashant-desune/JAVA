/* 
Question :- Write a program that asks the user to enter seconds as integer. The program should compute and display the number of hours, number of minutes and number of seconds in that seconds.
For example if user enters 4205 seconds. The answer should be
Hours : 1
Minutes : 10
Seconds : 5
*/
import java.util.*;
public class Hours_Minutes_and_Seconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Seconds: ");

        int seconds = sc.nextInt();
        
        //Hours
        int Hours = seconds/(3600);
        System.out.println("Hours :"+ Hours);

        //minutes
         seconds = seconds % 3600;
        int minutes = seconds/60;
        System.out.println("minutes :"+minutes);

        // Seconds
         int Seconds = seconds % 60;
         System.out.println("Seconds :"+Seconds);
    }
}
