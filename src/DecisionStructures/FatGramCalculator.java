package DecisionStructures;

import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args) {
        int calories;

        double fat;

        double caloriesFromFat;

        double percentOfFat;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of calories in a food: ");
            calories = keyboard.nextInt();

        System.out.print("Enter the number of grams of fat in that food: ");
            fat = keyboard.nextDouble();

            caloriesFromFat = fat * 9;

            percentOfFat = caloriesFromFat / calories;

            if (caloriesFromFat <= calories) {
                System.out.print("That food is made up of " + (percentOfFat * 100) + "% of fat.");

                if(percentOfFat <= .3) {
                    System.out.print(" The food is also low in fat.");
                }
            }
            else {
                System.out.print("The food may not contain more calories of fat then the total amount of calories.");
            }

    }
}
