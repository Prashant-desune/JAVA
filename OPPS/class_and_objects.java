

//!<------------------------------------------------------------  Classes And Objects ----------------------------------------------> 

/* -------------------------------------------------------------  How Write Classes    ------------------------------------------- */

/* 
class circle{
    //How to find the circle Area Perimeter Circumference   

    public double radius;

    // creating the methods 
    public double area(){
        return (22*radius*radius)/7;
    }
    public double perimeter(){
        return 2*(22*radius)/7;
    }
    
    public double circumference(){
        return perimeter();
    }
}
public class class_and_objects {
public static void main(String[] args) {

        circle C = new circle();// we have created here an Objects 
        circle C1 = new circle(); // we have created another class for same objects 
        C.radius = 7; //initializing the radius value 
        C1.radius = 14; //initializing the radius value  for the C1 class
        System.out.println(" Area of the circle is : " +  C.area());
        System.out.println(" perimeter of the circle is : " +  C.perimeter());
        System.out.println(" circumference of the circle is : " +  C.circumference());
        System.out.println("\n");
        System.out.println(" Area of the circle1 is : " +  C1.area());
        System.out.println(" perimeter of the circle1 is : " +  C1.perimeter());
        System.out.println(" circumference of the circle1 is : " +  C1.circumference());
    }
}
*/
//!<----- Output is ------->
/*

Area of the circle is : 154.0
perimeter of the circle is : 44.0
circumference of the circle is : 44.0


Area of the circle1 is : 616.0
perimeter of the circle1 is : 88.0
circumference of the circle1 is : 88.0

*/




//find the Area of A Rectangle
/* 
//creating a class
class Rectangle{
public double lenght;
public double breath;
public double area(){
    return lenght*breath;
}
public double perimeter(){
    return 2*(lenght*breath);
}
}

public class class_and_objects {
    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        R.lenght=10;
        R.breath = 8;
        System.out.println("The Area of the rectangle is : "+ R.area());
        System.out.println("The Perimeter  of the rectangle is : "+ R.perimeter());
    }
}
*/
//!<----- Output is ------->
/*
The Area of the rectangle is : 80.0
The Perimeter  of the rectangle is : 160.0
*/

//  Find the area of cylinder 

/*

class cylinder{
    public double radius;
    public double height;

    public double lidArea(){
        return 22*(radius*radius)/7;
    }
    public double totalSurfaceArea(){ //2πr(r + h)
        return 2*(22*radius)/7*(radius+height);
    }
    public double volume(){ //V=πr2h
        return 22*(radius*radius*height)/7;
    }
}
public class class_and_objects {

    public static void main(String[] args) {

        cylinder Cy = new cylinder();
        Cy.radius = 10;
        Cy.height = 12.3;
        System.out.println(" The total lidArea  of a cylinder is : "+ Cy.lidArea());
        System.out.println(" The total totalSurfaceArea of a cylinder is : "+ Cy.totalSurfaceArea());
        System.out.println(" The total volume of a cylinder is : "+ Cy.volume());
    }
}
*/


//!<----- Output is ------->
/*
The total lidArea  of a cylinder is : 314.2857142857143
 The total totalSurfaceArea of a cylinder is : 1401.7142857142858
 The total volume of a cylinder is : 3865.714285714286
*/

//Class Student data 

/*

//create a student class
class studentData{
    //field initialized
    public int roll;
    public String name;
    public String course;
    public int marks1,marks2,marks3;

    public int total(){
        return(marks1+marks2+marks3);
    }
    public int average(){
        return total()/3;
    }
    public char grades(){
        if (average() >= 60)
        return 'A';
        else
        return 'B';
    }


}

public class class_and_objects {

    public static void main(String[] args) {
        studentData student = new studentData();
        student.name = "prashant kumar";
        student.roll = 52;
        student.marks1 = 80;
        student.marks2= 85;
        student.marks3=93;
        System.out.println(" The name of the student is : " + student.name);
        System.out.println(" The roll of the student is : " + student.roll);
        System.out.println(" The total number of the Marks of the student  is : " + student.total());
        System.out.println(" The total Average  of number the student  is :"+ student.average());
        System.out.println("Grades of the student is : " + student.grades());
    }
}

*/



/*


 The name of the student is : prashant kumar
 The roll of the student is : 52
 The total number of the Marks of the student  is : 258
 The total Average  of number the student  is :86
Grades of the student is : A

*/

//!<<<----------------------------- Data Hiding ----------------------------->>>

// Find the area and the perimeter of the triangle using Data Hinding 
//! Data hiding is all about get and set method to undersatand using 

/*


//Find the area and the perimeter of the rectangle
//create a Class
class rectangle{
    //Both the properties are private it meens you can't access it from the outside of the class rectangle 
    private int lenght;
    private int breath;
    public int getLength(){
        return lenght;
    }
    public void setLength(int l){
        lenght = l;
    }
    
    public int getBreath(){
        return breath;
    }
    public void setBreath(int b){
        breath = b;
    }
    public int area(){
        return lenght*breath;
    }
    public int perimeter(){
        return 2*(lenght+breath);
    }
}

public class class_and_objects {
    
    public static void main(String[] args) {
        rectangle R = new rectangle();
        R.setLength(20);
        R.setBreath(10);
        System.out.println("Area of the rectangle is :" + R.area());
        System.out.println("Perimeter of the rectangle is :" + R.perimeter());
    }
}
*/

//!<----- Output is -------->
/*
Area of the rectangle is :200
Perimeter of the rectangle is :60


*/

//!          <--------------------------------------------- Type of properties in Opps ------------------------------------------------------------>
//1. Read and Writeable
//2. Read Only
//3. Write Only

//! Read and Writeable Example 
/* 
class square{
    private int length; 
    //Here we are read and write both doing get and set
    public int getLength(){
        return length;
    }
    public void setLength(int l){
        length = l;
    }
}

*/


//! 2. Read Only Example
/* 
class student{
    private int roll; 
    //Here we are read only property is used using get because we can't change roll no 
    public int getLength(){
        return roll;
    }
}
*/

//! 3. Write Only
/* 
*/



//!<-------------------------------------------------------------- CONSTRUCTOR IN JAVA -------------------------------------------------------------->
/* 
Cylinder 
*/

/*
class cylinder{
    //properties are intialized 
    private int radius;
    private int height;

    // create a CONSTRUCTOR 


    //!first constructor is used to set the value to 1 because the default value of the constructor is 0 .
    public cylinder(){
        radius=height=1;
    }
    public cylinder(int r, int h){
        radius = r;
        height = h;
    }

    //now get the value of a constructor using get function
    public int getRadius(){
        return radius;
    }

    public int getHeight(){
        return height;
    }

    public void setRadius(int r){
        if(r>=0){
            radius = r;
        }
        else{
            radius = 0;
        }
    }
    public void setHeight(int h){
        if(h>=0){
            height = h;
        }
        else{
            height = 0;
        }
    }
    public void setDimension(int h, int r){
        height = h;
        radius = r;
    }

    // the all are just the formulas 
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }

}

public class class_and_objects {

    public static void main(String[] args) {
        cylinder c = new cylinder();
        // c.setHeight(10);
        // c.setRadius(7);
        // c.setDimension(10, 7);

        System.out.println("LidArea "+c.lidArea());
        System.out.println("Circumference "+c.perimeter());
        System.out.println("totalSurfaceArea "+c.drumArea());
        System.out.println("Volume "+c.volume());
        System.out.println("Height"+c.getHeight());
        System.out.println("Radius"+c.getRadius());
    }
}
*/

//find the area and the perimeter of the rectangle using class and objects 

/*
class rectangle{
//properties of the rectangles
    private int lenght;
    private int breath;


    //create a constructor
    public rectangle(){
        lenght=breath=1;
    }

    public rectangle(int l, int b){
        lenght = l;
        breath = b;
    }
    
    //use get and set function
    public int getLength(){
        return lenght;
    }
    public int getBreath(){
    return breath;
}
    public void setBreath(int b){
        if(b>=0){
            breath = b;
        }
        else{
            breath = 0;
        }
    }
    public void setLength(int l){
        if(l>=0){
            lenght = l;
        }
        else{
            lenght=0;
        }
    }

    //! Properties Methods are used : - 

    public int areaRectangle(){
        return lenght*breath;
    }
    public int perimeterRectangle(){
        return 2*(lenght+breath);
    }
}

public class class_and_objects {

    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.setBreath(10);
        r.setLength(15);

        System.out.println("the area of the rectangle is : " + r.areaRectangle());
        System.out.println("the perimeter of the rectangle is : " + r.perimeterRectangle());
    }
}
*/


//------------------------------------- Learning Practice Questions And Solutions  ----------------------------------------------
