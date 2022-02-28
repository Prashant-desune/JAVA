import java.util.*;
public class ArithmeticSeries {
    static void printAP(int a, int d, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(a + (i - 1) * d + " ");
        }
    }
    public static void main(String[] args) {
        int a, d, n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a, d and n : ");
        a = sc.nextInt();
        d = sc.nextInt();
        n = sc.nextInt();

        printAP(a, d, n);
    }
}



