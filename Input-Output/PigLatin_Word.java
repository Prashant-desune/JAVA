/*
Question1: - Write a program that reads a word as input and converts that word to "Pig Latin". 
In this version of Pig Latin, you convert a word by removing the first letter, 
placing that letter at the end of the word, and then appending "ay" to the word. Here is an example:
English Word: night
Pig Latin Word: ightnay
*/
import java.util.*;
public class PigLatin_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.next();
        String pigLatinWord = word.substring(1) + word.charAt(0) + "ay"; //Method
        System.out.println("English Word:"+word);
        System.out.println("Pig Latin Word: "+pigLatinWord);
    }
}
