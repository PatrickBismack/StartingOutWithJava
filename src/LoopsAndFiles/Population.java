package LoopsAndFiles;

import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        int startingPopulation = 0;

        int days = 0;

        double averageGrowth = -1;

        Scanner keyboard = new Scanner(System.in);
        while (startingPopulation < 2) {
            System.out.print("Enter the starting population: ");
            startingPopulation = keyboard.nextInt();

            if ( startingPopulation < 2) {
                System.out.println("The starting population has to be at least 2.");
            }
        }

        while (averageGrowth < 0) {
            System.out.print("Enter the average population growth as a percent: ");
                averageGrowth = keyboard.nextDouble();

            if ( averageGrowth < 0) {
                System.out.print("The average growth rate may not be negative.");
            }
        }

        while (days < 1) {
            System.out.print("How many days will they multiple for: ");
                days = keyboard.nextInt();

            if (days < 1) {
                System.out.print("The number of days must be at least 1");
            }
        }

        System.out.println("Day    Population");
        for (int i = 0; i < days; i++) { //O(n)
           startingPopulation = (int)Math.floor(startingPopulation * averageGrowth) + startingPopulation;
            System.out.println((i + 1) + "      " + startingPopulation);
        }
    }
}
