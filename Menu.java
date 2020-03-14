import java.util.*;
/*a program that provides a menu with 5 options of conversion operations 
(eg. meters to feet, CAD to USD, Celsius to Fahrenheit, ...). Based on the 
user selection, the program should proceed with proper instructions, input
and output operations.*/

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Varibles
        int choice;
        String order;

        System.out.println("\n****  Menu of conversion operations ****\n");
        System.out.println(" 1.Meters to feet");
        System.out.println(" 2.CAD to USD");
        System.out.println(" 3.Celsius to Fahrenheit");
        System.out.println(" 4.Pounds to Kilograms");
        System.out.println(" 5.Hours to Seconds");

        System.out.println("\nEnter choice (1-5):\n");

        choice = sc.nextInt();// User choice

        switch(choice)//Using the Switch method
        {
        	case 1:
        	     System.out.println("\n Please Input the amount in meters\n");//Asking Input
        	     double meters = sc.nextDouble();
        	     double feet;

        	     feet = meters*3.28084;//Conversion

        	     System.out.println("");
        	     System.out.println( meters + " meters converted to feet is: " + feet);//Output

        	     break;

        	case 2:
        	     System.out.println("\nEnter the amount of CAD\n");//Asking Input
        	     double cad = sc.nextDouble();
        	     double usd;

        	     usd = cad*0.72;//Conversion

        	     System.out.println("");
        	     System.out.printf("The amount will be = %.2f$", + usd);//Output

        	     break;

        	case 3:
        	     System.out.println("\n Please enter the degres in Celcius\n ");//Asking Input
        	     double celsius = sc.nextDouble();
        	     double fahrenheit;

        	     fahrenheit = (celsius*9/5) + 32;//Conversion

        	     System.out.println("");
        	     System.out.println( celsius + " degres converted to fahrenheit is " + fahrenheit);//Output

        	     break;

        	case 4:
        	     System.out.println("\n Please enter the amount of pounds\n");//Asking Input
        	     double pounds = sc.nextDouble();
        	     double kilograms;

        	     kilograms = pounds*0.453592;//Conversion

        	     System.out.println("");
        	     System.out.printf(pounds + " lbs to kilograms is %.2f%n ", + kilograms);//Output
        	     break;

        	case 5:
        	     System.out.println("\n Please enter the amount of Hours\n");//Asking Input
        	     double hours = sc.nextDouble();
        	     double seconds;

        	     seconds = hours*3600;//Conversion

        	     System.out.println("");
        	     System.out.printf(hours + " hours to seconds is %.0f%n ", + seconds);//Output

        	     break;

        }
    }
}