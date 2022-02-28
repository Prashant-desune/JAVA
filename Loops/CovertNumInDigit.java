//Convert a given num in digit 
import java.util.*;
public class CovertNumInDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String strnum = "";
        while (num > 0) {
            int d = num%10;
            strnum=strnum+d;
            num = num/10;
        }
        System.out.println(strnum + "  ");
        char c;
        for (int i = strnum.length()-1;i>=0;i--) {
            c = strnum.charAt(i);
            switch (c) {
                case '0':System.out.print(" "+ "zero"+ " ");
                        break;
                case '1':System.out.print(" "+ "one"+ " ");
                        break;
                case '2':System.out.print(" "+ "two"+ " ");
                        break;
                case '3':System.out.print(" "+ "three"+ " ");
                        break;
                case '4':System.out.print(" "+ "four"+ " ");
                        break;
                case '5':System.out.print(" "+ "five"+ " ");
                        break;
                case '6':System.out.print(" "+ "six"+ " ");
                        break;
                case '7':System.out.print(" "+ "seven"+ " ");
                        break;
                case '8':System.out.print(" "+ "eight"+ " ");
                        break;               
                case '9':System.out.print(" "+ "nine"+ " ");
                        break;               
                default:
                    break;
            }
        }
    }
}
