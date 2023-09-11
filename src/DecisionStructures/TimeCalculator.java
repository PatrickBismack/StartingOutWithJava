package DecisionStructures;

import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        double seconds;

        double minutes;

        double hours;

        double days;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
            seconds = keyboard.nextDouble();

        if (seconds >= 86400) {
            days = (seconds / 86400);
            System.out.print("There are " + String.format("%.2f", days) + " day(s) in " + seconds + " seconds.");
        }
        else if (seconds >= 3600) {
            hours = (seconds / 3600);
            System.out.print("There are " + String.format("%.2f", hours) + " hour(s) in " + seconds + " seconds.");
        }
        else if(seconds >= 60) {
            minutes = (seconds / 60);
            System.out.print("There are " + String.format("%.2f", minutes) + " minute(s) in " + seconds + " seconds.");
        }
        else {
            System.out.print(seconds + " seconds is less than a minute.");
        }
    }
}
