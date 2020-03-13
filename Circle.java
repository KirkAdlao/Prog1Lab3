import java.util.*;
/* This program calculates s the area of a circle, based on a radius given by the user. 
If the input is negative, or zero, the program should not calculate the area, but warn 
the user of the mistake.*/
public class Circle {


    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.println("*************************************************");
        System.out.println("*********                               *********");
        System.out.println("*********  Area of a Circle Calculator  *********");
        System.out.println("*********                               *********");
        System.out.println("*************************************************");
        System.out.println("                                                 ");

        double pi = 3.14, area; // declare variables

        System.out.println("Enter radius of circle: "); // Get input

        //Calculator
        int r = sc.nextInt();
        area = pi * r * r;

        // if Statment  to prompt user if given an invalid number r > 0
        if (r>0) {

        System.out.println(" Area of circle: " + area);

        } else { System.out.println(" The input number is an invalid number");
                 System.out.println(" Please input a valid number");
             }



    }
}