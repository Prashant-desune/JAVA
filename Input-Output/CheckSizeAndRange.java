//Check Size And Range Of Data Types........


import java.lang.*;
public class CheckSizeAndRange{
    public static void main(String[] args) {
        System.out.println("Int Type : " + Integer.MIN_VALUE);
        System.out.println("Int Type : " + Integer.MAX_VALUE);
        System.out.println("Int Bytes : " + Integer.BYTES);
    }
}



/*

Int Type : -2147483648
Int Type : 2147483647
Int Bytes : 4

*/


import java.lang.*;
public class CheckSizeAndRange{
    public static void main(String[] args) {
        System.out.println("Float Type : " + Float.MIN_VALUE);
        System.out.println("Float Type : " + Float.MAX_VALUE);
        System.out.println("Float Bytes : " + Float.BYTES);
    }
} 


/*
Float Type : 1.4E-45
Float Type : 3.4028235E38
Float Bytes : 4
*/

import java.lang.*;
public class CheckSizeAndRange{
    public static void main(String[] args) {
        System.out.println("Bytes Type : " + Byte.MIN_VALUE);
        System.out.println("Bytes Type : " + Byte.MAX_VALUE);
        System.out.println("Bytes Bytes : " + Byte.BYTES);
    }
}

/*

Bytes Type : -128
Bytes Type : 127
Bytes Bytes : 1

*/