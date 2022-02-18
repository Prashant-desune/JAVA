//Compare Two given Strings .....
import java.util.*;
public class CompareStrings {
    public static void main(String[] args) {
        // String str1 = "hello sir my name prashant ";
        // String str2 = "Nice to meet you prashant..";
        //!Take the input::::
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Statements: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the Statements: ");
        String str2 = sc.nextLine();
        int count = 0;
        int count1 = 0;
        for(int i = 0 ; i<str1.length();i++){
            if(str1.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);

        for(int j = 0; j<str2.length(); j++){
            if(str2.charAt(j) !=' '){
                count1++;
            }
        }
        System.out.println(count1);

        if(count>count1){
            System.out.println("str1 is greater than str2 And The Str1 is :  " + str1);
        }
        else if(count1>count){
            System.out.println("str2 is greater than str1 And The Str2 is :  " + str2);
        }
        else{
            System.out.println("Both Strings are equal (str1==str2)");
        }
    }
}


/*

Enter the Statements: Hello Sir How are you ?

Enter the Statements: I am Fine Thnx For Asking .

//Output of the strings are : 18 and 21 so str2 is greater..

18
21


str2 is greater than str1 And The Str2 is :  I am Fine Thnx For Asking .

 */