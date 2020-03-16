import java.util.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.time.Period;

/*program that prompts the user for his/her date of birth in the format YYYY-MM-DD and 
outputs the user age, plus a message that tells you numbe of days your birthday is in 
or days past since your birthdat depending if the date in the current year has passed or not.
*/

public class Birthday {

    public static void main(String[] args) {

        System.out.println("\n*********   Next Birthday?   *********\n");
        Scanner sc = new Scanner(System.in);

        LocalDate bday;
        LocalDate today = LocalDate.now();

        System.out.println("Enter your year of birth");//User input
        int year = sc.nextInt();
        System.out.println("Enter your month of birth");//User input
        int month = sc.nextInt();
        System.out.println("Enter your day of birth");//User input
        int day = sc.nextInt();

        bday = LocalDate.of(year, month, day);

        Period p = Period.between(bday, today);

        System.out.println("");
        System.out.println("You're " + p.getYears() + " years old"); 
        System.out.println("");

        //If statement to calculate total of days till birthday
        
        if(bday.getDayOfYear()>= today.getDayOfYear()){
            int diff = ((bday.getDayOfYear()-today.getDayOfYear())+1);
            System.out.println("Your birthday is in " + diff + " day(s).");
        }
        else {
            int diff1 = ((today.getDayOfYear()-bday.getDayOfYear())-1);
            System.out.println("Your birthday was in " + diff1 + " day(s) ago.");
        }
    }
}