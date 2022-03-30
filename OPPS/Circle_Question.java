/*
Question Statement:
Circle Class:- 
Create a class to represent a Circle type in java, which should have following :
radius. Instance field of type double
 Set radius with default value of 1.0
Constructor. that accept an argument for radius
getRadius. public method that returns the radius of Circle
getArea. Method that returns the area of Circle
*/

class Circle{
    private double radius;
    
    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius*radius;
    }
}

public class Circle_Question {
    public static void main(String[] args) {
        Circle C = new Circle();
        C.setRadius(10);
        System.out.println(C.getRadius());
    }
}
