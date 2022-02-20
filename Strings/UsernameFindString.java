//Find the UserName and from email

public class UsernameFindString {
    public static void main(String[] args) {
        String str= "prashantkumar6061@gmail.com";
        int i = str.indexOf("@");
        String uname = str.substring(0,i);
        String Domain = str.substring(i+1,str.length());
        System.out.println("Full Email-id is : " + str);
        System.out.println("UserName is : " + uname);
        System.out.println("Domain Name is : " + Domain);

    }
}

/*
Full Email-id is : prashantkumar6061@gmail.com
UserName is : prashantkumar6061
Domain Name is : gmail.com
*/