//Example of an Abstract class in java 
//How to use and where to use it..
abstract class Super{
    public void meth1(){
        System.out.println("this is meth1");
    }

    //now when we use the method without using this body of method  {} 
    //then we have to use the abstract method and the we have to also write a it a Abstract class
    abstract public void meth2();
}
class Sub extends Super{
    // now sub is not a Abstract class so it will throw an error to me 
    //now I will make sub class to an Abstract class
    //I have to over ride the abstract method of Super class
    @Override
    public void meth2(){
        System.out.println("this is Meth2");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        //as we can see above i have create abstract method and classes 
        Super S1 = new Sub();
        //call both the method 
        S1.meth1();
        S1.meth2();
    }
}