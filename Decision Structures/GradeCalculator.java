/*The marks obtained by a student in 3 different subjects are input by the user.
Your program should calculate the average of subjects. 
The student gets a grade as per the following rules: */


/*
Average	    Grade

90-100      A

80-89       B

70-79       C

60-69       D

0-59        E

*/

import java.util.*;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Math's Number : ");
        int Maths = sc.nextInt();
        System.out.print("Enter The Physics Number : ");
        int Physics = sc.nextInt();
        System.out.print("Enter The Chemistry Number : ");
        int Chemistry = sc.nextInt();
        int average = (Maths+Physics+Chemistry)/3;
        if(average>=90){
            System.out.println("A");
        }
        else if(average>=80){
            System.out.println("B");
        }
        else if(average>=70){
            System.out.println("C");
        }
        else if(average>=60){
            System.out.println("D");
        }
        else{
            System.out.println("E");
        }
    }
}
