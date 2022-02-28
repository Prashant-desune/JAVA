//calculate Total and Average marks of 5 subjects
import java.util.*;
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math = sc.nextInt();
        int science = sc.nextInt();
        int computer = sc.nextInt();
        int social = sc.nextInt();
        int hindi = sc.nextInt();
        int sum = 0;
        sum = math + science + computer + social + hindi;
        float avg = sum/5;
        System.out.println(avg);
    }
}
