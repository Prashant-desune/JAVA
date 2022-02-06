//Question 3: Java Program to Convert int to char
public class ConverLong {
    public static void main(String[] args) {
        long a = 76567537l;
        int b = Math.toIntExact(a);
        //! int b = (int)a; // another way
        System.out.println("The value is : " + a);
    }
}
