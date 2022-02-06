//Java Program to convert primitive types to objects and vice versa

// Java Program to Convert Wrapper Objects to Primitive Types

public class ConvertPrimitiveTypes {
    public static void main(String[] args) {
      
        Integer obj1 = Integer.valueOf(23);
        Double obj2 = Double.valueOf(5.55);
        Boolean obj3 = Boolean.valueOf(true);

        // converts into primitive types
        int var1 = obj1.intValue();
        double var2 = obj2.doubleValue();
        boolean var3 = obj3.booleanValue();

            // print the primitive values
        System.out.println("The value of int variable: " + var1);
        System.out.println("The value of double variable: " + var2);
        System.out.println("The value of boolean variable: " + var3);
    }
}
