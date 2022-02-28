/*Write a do-while loop that asks the user to enter two numbers.
The numbers should be added and the sum displayed. 
The loop should ask the user whether he or she wishes to perform the operation again. 
If so, the loop should repeat; otherwise it should terminate. */
import java.util.*;
public class DoWhileSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do{
            System.out.print("Enter the num : ");
            int a = sc.nextInt();
            System.out.print("Enter the num");
            int b = sc.nextInt();
            int sum = (a+b);
            System.out.println("The sum of given output is : " + sum);
            System.out.println("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);
            if(choice=='n'){
                break;
            }
            else{
                continue;
            }
            
        }
        while(choice=='y'||choice=='n');
    }
}
