//Find the binary number 
public class FindBinaryInString {
    public static void main(String[] args) {
        int b =1110001010;
        String str = String.valueOf(b);
        System.out.println(str.matches("[01]*"));
    }
}
