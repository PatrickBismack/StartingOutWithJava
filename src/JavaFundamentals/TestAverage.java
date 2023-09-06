package JavaFundamentals;

import java.util.Scanner;

public class TestAverage {
    public static void main (String [] args){
        double scoreOne;

        double scoreTwo;

        double scoreThree;

        double scoreAverage;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your first test score: ");
            scoreOne = keyboard.nextDouble();

        System.out.print("Enter your second test score: ");
            scoreTwo = keyboard.nextDouble();

        System.out.print("Enter your third test score: ");
            scoreThree = keyboard.nextDouble();

            scoreAverage = ((scoreOne + scoreTwo + scoreThree) / 3);

        System.out.print("For the first test you received a " + scoreOne + "%, for the second test you received a " + scoreTwo
                + "%, for the third test you received a " + scoreThree + "%. Based on the scores, your average was " + scoreAverage + "%.");
    }
}
