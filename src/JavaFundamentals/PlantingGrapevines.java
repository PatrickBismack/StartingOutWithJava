package JavaFundamentals;

import java.util.Scanner;

public class PlantingGrapevines {
    public static void main (String [] args){
        int grapevinesPerRow;

        double lengthOfRow;

        double postSpace;

        double spaceBetween;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the length of rows: ");
            lengthOfRow = keyboard.nextDouble();

        System.out.print("Enter the amount of space used by an end post assembly: ");
            postSpace = keyboard.nextDouble();

        System.out.print("Enter the amount of space between grapevines: ");
            spaceBetween = keyboard.nextDouble();

        grapevinesPerRow = (int)((lengthOfRow - (2 * postSpace)) / spaceBetween);

        System.out.print("Base on the provided information you will need " + grapevinesPerRow + " grapevines per row.");
    }
}
