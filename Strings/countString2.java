//!Java Program to count the total number of characters in a string 2
// import javax.swing.*;
public class countString2 {
    public static void main(String[] args) {
        int count = 0;
        int count1 = 0; 
        String str = ("This Side Prashant Kumar!!");
        String str1 = ("Nice to meet you Prashant");
        for(int i = 0 ; i<str.length();i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("The value of String is : " + count);


        for(int j = 0 ; j<str1.length();j++){
            if(str1.charAt(j) != ' '){
                count1++;
            }
        }
        System.out.println("The value of String is : " + count1);
        
    }
}

/*
The value of String is : 23
The value of String is : 21
*/