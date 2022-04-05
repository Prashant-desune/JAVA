class Super{
    public void method(){
        System.out.println("method 1 is called");
    }
    public void method2(){
        System.out.println("Method 2 is called ");
    }
}

class Sub extends Super{
    public void method2(){
        System.out.println(" Sub Method 2 is called ");
    }
    public void method3(){
        System.out.println("Method 3 is called ");
    }
}

//! VERY VERY IMPORTANT THIS ONE IS : 

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //! here we will see how to use the DynamicMethodDispatch using new keyword.
        Super s1 = new Sub(); // this is Allowed but but 
        //! Sub s1 = new Super(); // this is not Allowed 
        s1.method2(); //!output  Sub Method 2 is called 
        //! s1.method3(); This can't be called with the reference value s1 because method 3 is not the part of Super class .
    //! Here we can see when i called the method 2 the object is called not the reference so the mthod2 of the Super class is Shadowed ..
    }
}