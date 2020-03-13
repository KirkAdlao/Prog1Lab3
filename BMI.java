import java.util.*;
/* This program calculates the Body Mass Index (BMI) of a person.
It tells the user their classification as underweight, normal, overweight or obese*/
public class BMI {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("************************************");
        System.out.println("*********                  *********");
        System.out.println("*********  BMI Calculator  *********");
        System.out.println("*********                  *********");
        System.out.println("************************************");
        System.out.println("                                    ");


        //Get input
        System.out.println("What is your weight in pounds?");
        double weight = sc.nextDouble();

        System.out.println("What is your height in feet(inches)?");
        double height = sc.nextDouble();

        //Convertor

        double kilograms = weight*0.453592;
        System.out.println("Your weight in kilograms :" + kilograms);


        double meters = height*0.3048;
        System.out.println("Your height in meters :" + meters);

        //BMI calculator
        double bmi = (kilograms/(meters*meters));
        System.out.println("\nYour calculated BMI = " + bmi);

        //If statement that tells the user their verbal rating

        if (bmi<18.5) {
            System.out.println(" You are underweight");
        }
        else if(bmi<25) {
            System.out.println(" You are normal");
        }
        else if (bmi<30) {
            System.out.println(" You are overweight");
        }
        else if (bmi>30) {
           System.out.println(" You are obese");
        }

    }

}