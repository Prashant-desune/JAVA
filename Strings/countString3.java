//Java Program to count the total number of punctuation characters exists in a String
/*punctuation marks (!, . , ' , - , " , ? , ; ) */

public class countString3 {
    public static void main(String[] args) {
        int count = 0;
        String str = ("this, is me! / how are you :: || What's up today ? - All the best . 'best about you',;done to know !!  ");
        for(int i = 0 ; i< str.length();i++){
            if(str.charAt(i) == '!' ||str.charAt(i) == '.'||str.charAt(i) == '-'||str.charAt(i) == '?'||str.charAt(i) == ';'||
            str.charAt(i) == ','||str.charAt(i) == '\"'||str.charAt(i) == '/'||str.charAt(i) == ':'){
                count++;
            }
        }
        System.out.println("The number of punctuations exists in the string is: " +count); 
    }
}
