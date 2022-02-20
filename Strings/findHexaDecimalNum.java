//Find the Hexa decimal number 
// 1.)Start from [0->9]
// 2.)And [A->F] 

public class findHexaDecimalNum {
    public static void main(String[] args) {
        String str = "2358A7BC2D";
        System.out.println(str.matches("[0-9A-F]+"));
    }
}
