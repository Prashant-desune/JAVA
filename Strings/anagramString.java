//Java Program to determine whether two strings are the anagram

/*
Question - What is anagram ? 


Two Strings are called the anagram if they contain the same characters. 
However, the order or sequence of the characters can be different.

 */
import java.util.Arrays; 
public class anagramString {
    public static void main(String[] args) {
        String str1  = "tab";
        String str2 = "bat";
        int count = 0;
        int count1 = 0;
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();
        if(str1.length() != str2.length()){
            System.out.println("Both Strings are not Anagram");
        }
        else{

             //!Converting both the arrays to character array 

            char[] string1 = str1.toCharArray();  
            char[] string2 = str2.toCharArray(); 

            //!Sorting the arrays using in-built function sort () 

            Arrays.sort(string1);
            Arrays.sort(string2);
            
            if(Arrays.equals(string1, string2)== true ){
                System.out.println("Both Strings are Anagram");
            }
            else{
                System.out.println("Both the strings are not anagram");  
            }
        }
    }
}
