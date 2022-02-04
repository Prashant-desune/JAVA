/* 
Question : - Area of the Rectangle
*/
import java.util.*;
public class Area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of length: ");
        double lenght = sc.nextDouble();
        System.out.print("Enter the value of width: ");
        double Width = sc.nextDouble();
        double area = (lenght*Width);
        System.out.println("Area of a area" + area);
    }
}
