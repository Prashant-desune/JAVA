class Circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2 * Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
} 
class Cylinder extends Circle{ // extends keyword is used for inheritance in java . 
    public double height;

    public double volume(){
        return area()*height;
    }
}

public class CircleAndCylinder {
    public static void main(String[] args) {
        Cylinder C = new Cylinder();
        C.radius = 10;
        C.height = 17;

        System.out.println("Volume of cylinder is : "+ String.format("%.3f",C.volume()));
        System.out.println( "Area of cylinder is :"+ String.format("%.3f",C.area()));
    }
}

/*

Volume of cylinder is : 5340.708
Area of cylinder is :314.159


 */