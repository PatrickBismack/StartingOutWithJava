package LoopsAndFiles;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        int years;

        int totalMonths = 0;

        double month;

        double average;

        double totalRain = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
            years = keyboard.nextInt();

        for (int i = 0; i < years; i++) { // O(n)
            for (int j = 0; j < 12; j++) {
                System.out.print("Enter the amount of rain for month " + (j + 1) + " for the " + (i + 1) + " year: ");
                    month = keyboard.nextDouble();

                    totalRain = totalRain + month;
                    totalMonths++;
            }
        }
        average = (totalRain / totalMonths);
        System.out.print("In " + totalMonths + " months it rained a total of " + totalRain + " inches. The average rainfall per month is " + average
                + " inches.");
    }
}
