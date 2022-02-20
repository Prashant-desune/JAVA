//String Special Character 

public class SpecialCharacter {
    public static void main(String[] args) {
        String str = "123@4%7*23$8";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
    }
}