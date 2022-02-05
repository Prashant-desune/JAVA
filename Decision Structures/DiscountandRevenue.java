/*Revenue can be calculated as the selling price of the product times the quantity sold, 
i.e. revenue = price × quantity. Write a program that asks the user to enter product price 
and quantity and then calculate the revenue. If the revenue is more than 5000 a discount is 10% offered.
 Program should display the discount and net revenue. */
import java.util.*;
public class DiscountandRevenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Price : ");
        int price = sc.nextInt();
        System.out.print("Enter The Quantity : ");
        int quantity = sc.nextInt();
        int revenue = (price * quantity);
        if(revenue >= 5000){
            int discount = (revenue*10)/100;

            System.out.println("After Discount the price is : "+ (revenue-discount));
        }
        else{
            System.out.println("The Final Price is : " + revenue);
        }
    }
}
