//gp series
import java.util.*;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int times = sc.nextInt();
        int d = a;
        for(int i = 0; i<times;i++){
            System.out.print(d +" ");
            d = d*b;
        }
    }
}
