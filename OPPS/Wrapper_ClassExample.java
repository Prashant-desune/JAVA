//! USEFUL METHOD OF FUNCTION ARE :
// Xxx is the primetive data type  : (just for the explanation : )

//!   1.)   VALUEOF()
//!   2.)   PARSE Xxx() 
//!   3.)   Xxx Value()


public class Wrapper_ClassExample {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("1010101",2);
        Double i2 = Double.valueOf("12.345");
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("13.43");

        int c = i1.intValue();
        System.out.println(c); // 85
        float d = i1.intValue();
        System.out.println(d);//85.0
        

        
    }
}
