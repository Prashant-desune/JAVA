//Java Program to count the total number of characters in a string...countString full String Without Space 
import java.util.*;
public class countString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the string : ");
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0 ; i<str.length();i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("The count of the Strings is : " + count);
    }
}
