package DecisionStructures;

import java.util.Scanner;

public class BankCharges {
    public static void main(String[] args) {
        int checks;

        double baseFee = 10.0;

        double fee;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of checks you wrote this month: ");
            checks = keyboard.nextInt();

        if (checks < 20) {
            fee = (checks * .10) + baseFee;

            System.out.print("Your service fee for this month is $" + fee + ".");
        }
        else if ( checks >= 20 && checks <= 39) {
            fee = (checks * .08) + baseFee;

            System.out.print("Your service fee for this month is $" + fee + ".");
        }
        else if (checks >= 40 && checks <= 59) {
            fee = (checks * .06) + baseFee;

            System.out.print("Your service fee for this month is $" + fee + ".");
        }
        else if (checks >= 60) {
            fee = (checks * .04) + baseFee;

            System.out.print("Your service fee for this month is $" + fee + ".");
        }
        else {
            System.out.print("There was an error calculating your service fee for this month.");
        }
    }
}
