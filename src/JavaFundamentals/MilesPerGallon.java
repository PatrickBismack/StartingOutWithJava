package JavaFundamentals;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String [] args){
        double miles;

        double gallonsUsed;

        double milesPerGallon;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of miles driven: ");
            miles = keyboard.nextDouble();

        System.out.print("Enter the number of gallons used: ");
            gallonsUsed = keyboard.nextDouble();

            milesPerGallon = miles / gallonsUsed;

        System.out.println("You drove " + miles + " mile(s), used " + gallonsUsed + " gallon(s) of fuel. You recieved " + milesPerGallon
                + " mile(s) per gallon of fuel.");
    }
}
