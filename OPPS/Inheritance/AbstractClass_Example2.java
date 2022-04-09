//Create an Abstract Class and Method Of Shape
abstract class Shape{
    //Add the Methods of Shape without the body 
    abstract public void area();
    abstract public void perimeter();

}
// now I take two Sub class circle and the rectangle which is the extends of Parents Abstract class Shape 
class Circle extends Shape{
    int radius;
    @Override
    public void area(){
       System.out.println("Area of the circle is : "+ (22*radius/7));
    }
    @Override
    public void perimeter(){
        System.out.println("Perimeter of the circle is : "+(2*22*radius/7));
    }
}

class Rectangle extends Shape{
    int length;
    int breath;
    @Override
    public void area(){
        System.out.println("Area of the rectangle is : " + (length*breath) );
    }
    @Override
    public void perimeter(){
        System.out.println("Perimeter of the Rectangle is : " + (2*length*breath) );
    }
}

public class AbstractClass_Example2 {
    public static void main(String[] args) {
        Circle C1 = new Circle();
        C1.radius = 10;
        C1.area();
        C1.perimeter();
        Rectangle R1 = new Rectangle();
        R1.length = 20;
        R1.breath = 35;
        R1.area();
        R1.perimeter();
    }
}
