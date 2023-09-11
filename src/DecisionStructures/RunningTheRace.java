package DecisionStructures;

import java.util.Scanner;

public class RunningTheRace {
    public static void main(String[] args) {
        String runner1;

        String runner2;

        String runner3;

        String temp;

        double runner1Time;

        double runner2Time;

        double runner3Time;

        double tempTime;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first runners name: ");
            runner1 = keyboard.nextLine();

        System.out.print("Enter the first runners time in minutes: ");
            runner1Time = keyboard.nextDouble();
            keyboard.nextLine();

        System.out.print("Enter the second runners name: ");
            runner2 = keyboard.nextLine();

        System.out.print("Enter the second runners time in minutes: ");
            runner2Time = keyboard.nextDouble();
            keyboard.nextLine();

        System.out.print("Enter the third runners name: ");
            runner3 = keyboard.nextLine();
        System.out.print("Enter the third runners time in minutes: ");
            runner3Time = keyboard.nextDouble();

        if (runner2Time < runner1Time) { //r1 10 r2 8 r3 7
            temp = runner2;
            runner2 = runner1;
            runner1 = temp;

            tempTime = runner2Time;
            runner2Time = runner1Time;
            runner1Time = tempTime;
        }   //r1 8 r2 10 r3 7
        if (runner3Time < runner2Time) {
            temp = runner3;
            runner3 = runner2;
            runner2 = temp;

            tempTime = runner3Time;
            runner3Time = runner2Time;
            runner2Time = tempTime;
        } //r1 8 r2 7 r3 10
        if (runner2Time < runner1Time) {
            temp = runner2;
            runner2 = runner1;
            runner1 = temp;

            tempTime = runner2Time;
            runner2Time = runner1Time;
            runner1Time = tempTime;
        }

        System.out.print(runner1 + " finished first, " + runner2 + " finished second, and " + runner3 + " finished third.");
    }
}
