//! <<<<<<<<<<<<<<<<<<<<<<_________________ PRACTICE FUNCTION QUESTION ______________________>>>>>>>>>>>>>>>>>>>>

/*
// <<<<<<<<<<< Sum of two numbers in java Using Functions >>>>>>>>>>>>>

import java.util.*;
public class fuctionPractice {
    public static int sumOfNumber(int a, int b){
        int sum = 0;
        sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumOfNumber(a, b);
        System.out.println("the value of sum is : " + sum );
    }
}
 */

//Find The factorial of number in java 
/*

import java.util.*;
public class fuctionPractice {
    public static void factorialOfNum(int num){
        int factorial = 1;
        for(int i = num; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factorialOfNum(num);
    }
}

*/


// Write a function to calculate the product of 2 numbers.
/*

import java.util.*;
public class fuctionPractice {
    public static void productSum(int a, int b){
        int product = 1;
        int sum = 0;
        product = a*b;
        System.out.println("The product is : " + product);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        productSum(a, b);
    }
}


*/

//Make a function to check if a number is prime or not.

/*

import java.util.*;
public class fuctionPractice {
    public static void PrimeNum(int number){
        int flag = 0;
        for(int i = 2;i<=number;i++){
            if(number%i==0){
                flag = flag+1;
            }
        }
        if(flag==1){
            System.out.println("yes its A primeNum : " + number);
        }
        else{
            System.out.println("Not a prime number : " + number);
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want : ");
        int number = sc.nextInt();
        PrimeNum(number);
    }
}

*/

//Make a function to check if a given number n is even or not.
/*

import java.util.*;
public class fuctionPractice {
    public static int evenOrOdd(int num){
        if(num % 2 == 0){
            System.out.println("num is even : " + num);
        }
        else{
            System.out.println("Num is odd : " + num);
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        evenOrOdd(num);
    }
}

*/

//Make a function to print the table of a given number n.

/*

import java.util.*;
public class fuctionPractice {
    public static void printTable(int num){
        for(int i = 1; i<=10;i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        printTable(num);
    }]
}

*/

//Find the greatest number in three variable in java : 


/*
import java.util.*;
public class fuctionPractice {
    public static void maxNumberFind(int a, int b, int c) {
        if (a>b && a>c){
            System.out.println("The value 'a' is greater among all the three : " + a);
        }
        else if(b>a && b>c){
            System.out.println("The value 'b' is greater among all the three : " + b);
        }
        else{
            System.out.println("The value 'c' is greater among all the three : " + c);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all the three values ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maxNumberFind(a, b, c);
    }
}

*/

//Another way to declare functions are  By an example of divide two numbers .
/*
import java.util.*;
public class fuctionPractice {
    //! here I am not declare that it is non-static 
    int  divideTwoNumbers(int a, int b){
        int divide = a/b;
        return divide;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        fuctionPractice divi = new fuctionPractice(); //creating an object of the class 
        System.out.println(divi.divideTwoNumbers(a, b));//call the object 
    }
}

*/

//Example of call by value is ..
/*


public class fuctionPractice {
    public static void inc(int x){
        x++;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int a = 10, b = 15;
        inc(a); //the value of the a is stored in the value of B.
        System.out.println(a);
    }
}


*/

//Topic Name is
//! <<<-- Passing object as parameters --->>>
/*
public class fuctionPractice {
    static void update(int A[]){
        A[0] = 25;
    }
    public static void main(String[] args) {
        int A [] = {1,2,3,4,5,6};
        update(A);
        System.out.println(A[0]);
    }
}

*/

/**

 public class fuctionPractice {
     static void change(int A[], int index, int values){
         A[index]=values;
        }
        public static void main(String[] args) {
            int A[] = { 1,2,3,4,5,6};
            change(A, 2, 20); //change is a function used to change and put the other passed values to it's index  .
            for(int x : A){
                System.out.println(x);// now the value is change in A[] at the second position 6 it will be placed 20.
            }
        }
    }


*/

// Example using the strings.
/*

public class fuctionPractice {
    public static void greating(String name) {
        System.out.println("Hello Mr. " + name + " good to see you .");
    }
    public static void main(String[] args) {
        String name  = "prashant kumar";
        greating(name);
    }
}


*/

//Find the gcd of two numbers Using the Functions  : 
/*

import java.util.*;
public class fuctionPractice {
    public static int gcdOfNum(int a, int b){
        while(a!=b){
            if(a>b){
                a= a-b;
            }
            else if(b>a){
                b = b-a;
            }
        }
        return a;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second  value : ");
        int b = sc.nextInt();
        System.out.println("The common GCD of A and B is : "+gcdOfNum(a, b));
        
    }
}

*/



// Find the maximum value in an Array..
/*

public class fuctionPractice {
    public static int maxArray(int[] A){
        int max=A[0];
        for(int i = 1; i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int A[] = {1,12,13,15,17,9,54,34,98,76,98,34,54,34,89,97};
        System.out.println("Max num is : " + maxArray(A));
    }
}

*/

//!                          <-------------    METHOD OVERLOADING -------------------------->

//Example of METHOD OVERLOADING
// <------- By this example we get to know about  Method OverLoading is accesing the same function name again and again in different scenario if the parameters are same the it will give an error to the user   ------>
/* 
import java.util.*;
public class fuctionPractice {
    public static int max(int a, int b){
        return a>b ? a:b; //it means if a is greater than b go for A or else viceversa .
    }
    //here we are going to found the greatest number among the three values ..
    public static void max(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("The greatest value is : " + a);
        }
        else if(b>a && b>c){
            System.out.println("The greatest value is : " + b);
        }
        else{
            System.out.println("The greatest value is : " + c);
        }
    }
    //print table of given number using same function 
    public static void max(int a){
        for(int i = 1; i<10; i++){
            System.out.println(a+" x "+i+" = " + a*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();
        max(a);//it will print the table of given value a.
        System.out.println(max(10,23));//it will return 11 
        max(a, b, c); // it will print the greatest value
    }
}


*/
// Overloaded methods to calculate areas .
/*

public class functionPractice {
    //find the area of rectangle
    public static int Area(int l, int b){
        int a = l*b;
        return a;
    }
    //find the area of a Circle is : 
    public static int Area(int r){
        int a = (22*r*r)/7;
        return a;
    }
    //find the area of the Triangle 
    public static long Area(long l, long b){ //As we can se here I have taken two parameters but i have taken another parameters.
        long a = (l*b)/2;
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Area of the rectangle is : "+Area(10, 12)); 
        System.out.println("Area of the circle is : "+Area(10));
        System.out.println("Area of the Triangle  is : "+Area(60,38));
    }
    
}


*/


//Overloaded methods to reverse a int or array ........
/*

public class functionPractice {
    public static void arrayReverse(int[] A){
        int[] B = new int[9];
        for(int i = A.length-1,j=0;i>=0;i--,j++){
            B[j]=A[i];
        }
        for(int x : B){
            System.out.println(x);
        }
        return;
    }
    public static void main(String[] args) {
        int num [] = new int[10];
        int[] A = {1,2,3,4,5,6,7,8,9};
        arrayReverse(A);
    }
}

*/
//!veryImport example of non-statics
// Overload method to validate name and age 
/*

import java.util.*;
public class functionPractice {
    boolean names(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    boolean Age(int age){
        return age>=3 && age<=15;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        functionPractice Val = new functionPractice();
        System.out.println(Val.names(name));
        functionPractice Val1 = new functionPractice();
        System.out.println(Val1.Age(age));
    }
}

*/

//!     <-------------               VARIABLE ARGUMENTS          ---------------------->

// Lets take an example of variable arguments in java ..
/*

public class functionPractice {
    public static void show(int ...A){
        for(int x : A){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show();// Now see this is also valid but it will not print anything just because no parameter is passed in it 
        show(10,20,30,40,50,60);// this is also valid it will store all the value in the parameter In simple i can say is there is no reference that means yes it is an anonymous arrays.
        show(new int[]{10,20,30,33,40,50,60}); // this is anonymous Array 
        // show(int a[] = new int[]{10,20,30,33,40,50,60}); //! this is not an anonymous array 
    }
}


*/

//print the names in a string with repective counting numbers : 
/*

public class functionPractice {
    public static void showList(String ...S){
        for(int i = 0; i<S.length;i++){
            System.out.println(i+1+". "+ S[i]);
        }
    }
    public static void main(String[] args) {
        showList("Prashant","Aman","Akashy","alok","Aarav","Harsh","Vishal","Somnath");
    }
}

//!output is : 
1. Prashant
2. Aman
3. Akashy
4. alok
5. Aarav
6. Harsh
7. Vishal
8. Somnath

*/
/* 
//We can also add different index to the list assigned 
public class functionPractice {
    public static void showList(int start, String ...S){
        for(int i = 0; i<S.length;i++){
            System.out.println(start+". "+ S[i]);
            start++;
        }
    }
    public static void main(String[] args) {
        showList(6,"Prashant","Aman","Akashy","alok","Aarav","Harsh","Vishal","Somnath");
    }
}

//Output is : As we can see now the index is starting from 6 after assigned the value 6 to Start 
6. Prashant
7. Aman
8. Akashy
9. alok
10. Aarav
11. Harsh
12. Vishal
13. Somnath


*/
//Maximum of using the varargs
/*

public class functionPractice {
    public static int max(int ...A){
        if(A.length==0)return Integer.MIN_VALUE;
        int max=A[0];
        for(int i = 1; i<A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(max()); //it will return the minimum value of an Integer is -2147483648
        System.out.println(max(10,12,13)); //13
        System.err.println(max(23,20,30,23,45,65,76,25,34,10));//76
        System.out.println(max(10,20,30,23,45,65,76,25,34,23,12,43,87,98,78,97,67,48,9,79,34,85,38,5));//98
        System.out.println(max(new int[]{10,20,30,23,45,25,34,}));//45
    }
}
*/

//sum of all the elements using varArgs 

/*
public class functionPractice {
    public static int sum(int ...A){
        int s = 0;
        for(int i = 0; i<A.length;i++){
            s = s+i;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(10,12,13)); 
        System.out.println(sum(new int[]{10,20,30,23,45,25,34}));
    }
}

*/

// Calcuate discount using varargs 
/*

public class functionPractice {
    public static double discount(double ...A){
        int d = 0;
        for(int i = 0; i<A.length;i++){
            d = d+i;
        }
        return d;
    }
    public static void main(String[] args) {
        System.out.println(discount());
        System.out.println(discount(96.1210,296.120,396.120,2396.12,4596.12,696.125,796.126,25,396.124,296.123,1296.12,43,896.127,9896.12,796.128,996.127,696.127,496.128,996.12,7996.12,396.124,96.1285,396.128,96.125));
        System.out.println(discount(new double[]{10.5,205.4,305.4,255.3,4345.5,24554.32,3234.44,}));
    }
}

*/
































