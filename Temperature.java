import java.util.*;
/*program that prompts the user for the current temperature in Celsius and outputs 
different messages if it is above or below zero.*/

public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n*********   Temperature Calculator   *********\n");

        //Asking user for input
        System.out.println("\n Please give me the current Temperature in Celsius\n ");
        double temperature = sc.nextDouble();

        // Using the conditional operator
        System.out.println(temperature > 0 ? "\n It is a moderate weather today." : 
                                             "\n It is fairly cold today.");
    }
}