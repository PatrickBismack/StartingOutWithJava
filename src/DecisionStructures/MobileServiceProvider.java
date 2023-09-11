package DecisionStructures;

import java.util.Scanner;

public class MobileServiceProvider {
    public static void main(String[] args) {
        char plan;

        int minutes;

        int minutesOver;

        double cost;

        double costDifference;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the letter of your plan: ");
            plan = keyboard.nextLine().charAt(0);

        System.out.print("Enter the number of minutes you used: ");
            minutes = keyboard.nextInt();

        switch (Character.toLowerCase(plan)) {
            case 'a':
                minutesOver = 450 - minutes;
                cost = 39.99;

                if (minutesOver < 0) {
                    cost = 39.99 + (-minutesOver * 0.45);
                }

                System.out.print("With plan " + Character.toString(plan) + " your total is $" + String.format("%.2f", cost) + ".");
                    costDifference = 59.99 + (-(900 - minutes) * 0.40);

                if (costDifference <= cost) {
                    cost = cost - costDifference;
                    System.out.print(" If you switch to plan b, you could save $" + String.format("%.2f", cost) + ".");
                }
                break;
            case 'b':
                minutesOver = 900 - minutes;
                cost = 59.99;

                if (minutesOver < 0) {
                    cost = 59.99 + (-minutesOver * 0.40);
                }

                System.out.print("With plan " + Character.toString(plan) + " your total is $" + String.format("%.2f", cost));

                if (69.99 <= cost) {
                    cost = cost - 69.99;
                    System.out.print(" If you switch to plan c, you could save $" + String.format("%.2f", cost) + ".");
                }
                break;
            case 'c':
                System.out.print("Your bill is $69.99");
                break;
            default:
                System.out.print(Character.toString(plan) + " is not a valid plan.");
                break;
        }

    }
}
