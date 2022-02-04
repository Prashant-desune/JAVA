/*
Write a program that when complete will calculate the amount of paint needed to paint 
the walls and the ceiling of a room. Your program should ask length, width, 
and height of room. Assume that the room has doors and windows the don't need painting.
 Also the floor in the room is not painted. Ask the user to enter the number of 
doors and number of windows in the room, and adjust the total square feet to be painted 
accordingly. Assume that each door is 20 square feet and each window is 15 square feet.
Suppose the paint covers 350 square feet per gallon.
*/

import java.util.*;
public class Wall_Painting_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        System.out.print("Enter height: ");
        int height = sc.nextInt();
        System.out.print("Enter num of doors : ");
        int doors = sc.nextInt();
        System.out.print("Enter num of windows : ");
        int windows = sc.nextInt();
        
        int total_Surface_Area = 2*( length*width + length*height + width*height );
        int area_of_floor = length*width;
        int area_of_doors = 20 * doors; 
        int area_of_windows = 15 * windows;
        int total_painted_area = total_Surface_Area - area_of_floor - area_of_doors - area_of_windows;
        int required_paint = total_painted_area/350;
        System.out.println("Paint required " + required_paint +" "+ "gallons.");
    }
}
