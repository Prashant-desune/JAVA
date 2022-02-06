//Question : Java Program to Convert Character to String and Vice-Versa
import java.util.*;
public class ConvertCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character value : ");
        char ch = sc.next().charAt(0);
        String abc = Character.toString(ch); //this character.toString is use to covert String to character.
        System.out.println("The String is : " + abc);
    }
}