/*Write a program to enter the numbers till the user wants and at the end it 
should display the count of positive, negative and zeros entered. */
import java.util.*;
public class FindEvenOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the number : ");
        int number=sc.nextInt();
        int positive = 0;
        int negative = 0;
        int Zeroes = 0;
        char choice;
        do{
            if(number>0){
                positive++;
            }
            else if(number<0){
                negative++;
            }
            else{
                Zeroes++;
            }
            System.out.println("Do you want to continue  Y or N ? ");
            choice = sc.next().charAt(0);
        }
        while(choice=='Y'|| choice=='Y');
        System.out.println("Positive No :" +positive );
        System.out.println("Negative No :" + negative);
        System.out.println("Zeroes No :" + Zeroes);
    }
}
