package DecisionStructures;

import java.util.Scanner;

public class TestScoresAndGrades {
    public static void main (String [] args){
        double test1;

        double test2;

        double test3;

        double average;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your score for test one: ");
            test1 = keyboard.nextDouble();

        System.out.print("Enter your score for test two: ");
            test2 = keyboard.nextDouble();

        System.out.print("Enter your score for test three: ");
            test3 = keyboard.nextDouble();

            average = (test1 + test2 + test3) / 3;

        if (average >= 90) {
            System.out.print("You test average was " + String.format("%.2f", average) + "%, so your letter grade is an A");
        }
        else if (average >= 80 && average <= 89) {
            System.out.print("You test average was " + String.format("%.2f", average) + "%, so your letter grade is a B");
        }
        else if (average >= 70 && average <= 79) {
            System.out.print("You test average was " + String.format("%.2f", average) + "%, so your letter grade is a C");
        }
        else if (average >= 60 && average <= 69){
            System.out.print("You test average was " + String.format("%.2f", average) + "%, so your letter grade is a D");
        }
        else {
            System.out.print("You test average was " + String.format("%.2f", average) + "%, so your letter grade is an E");
        }
    }
}
