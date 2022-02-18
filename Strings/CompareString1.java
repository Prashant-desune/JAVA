//Compare The Strings Using the String Not by count using compare function
import java.util.*;
public class CompareString1 {
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Statements: ");
        String str1 = Sc.nextLine();
        System.out.print("Enter the Statements: ");
        String str2 = Sc.nextLine();
        if(str1.compareTo(str2)==0){
            System.out.println("Both strings str1 and Str2 is equal !");
        }
        else{
            System.out.println("Not equal to each other !");
        }

    }

}

/* 
Enter the Statements: hello
Enter the Statements: hello
Both strings str1 and Str2 is equal !
*/

/*  
Enter the Statements: hello 
Enter the Statements: hello 1
Not equal to each other !
*/