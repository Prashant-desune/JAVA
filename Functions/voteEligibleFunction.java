/*Write a function that takes in age as input and returns if that person is eligible to vote or not. 
A person of age > 18 is eligible to vote.
*/
import java.util.*;
public class voteEligibleFunction {
    public static void ageEligible(int age){
        if(age>18){
            System.out.println("Yes, you are eligible");
        }
        else{
            System.out.println("No, you are not eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        ageEligible(age);
    }
}
