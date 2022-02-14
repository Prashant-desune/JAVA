import java.util.*;
public class quard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double r1;
        r1 = (-b+Math.sqrt((b*b)-4*a*c))/(2*a);
        double r2;
        r2 = (-b-Math.sqrt((b*b)-4*a*c))/(2*a);
        System.out.println("Root are "+ r1 + " " + r2);
    }
}
