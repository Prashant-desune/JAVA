/*
Write a program to calculate the monthly telephone bills as per the following rule: 
Minimum Rs. 200 for up to 100 calls. 
Plus Rs. 0.60 per call for next 50 calls. 
Plus Rs. 0.50 per call for next 50 calls. 
Plus Rs. 0.40 per call for any call beyond 200 calls.

*/
import java.util.*;
public class TelephoneBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of calls : ");
        int call = sc.nextInt();
        double bill ;
        if(call<=100){
            bill = 200;
            System.out.println("bill is : "+bill);
        }
        else if(call<=150){
            bill = 200+(call-100)*0.60;
            System.out.println("bill is : "+bill);
        }
        else if(call<=200){
            bill = (200+50*0.60+(call-150)* 0.50);
            System.out.println("bill is : "+bill);
        }
        else{
            bill = (200+50*0.60+50+0.50+(call-200)*0.40);
            System.out.println("bill is : "+bill);
        }

    }
}
