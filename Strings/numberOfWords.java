//Word Count...
public class numberOfWords{
    public static void main(String[] args) {
        String str = "my name is prashant";
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}

