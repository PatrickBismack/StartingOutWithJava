package DecisionStructures;

import java.util.Scanner;

public class ShippingCharges {
    public static void main(String[] args) {
        double pounds;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the weight of your package: ");
            pounds = keyboard.nextDouble();

        if (pounds <= 2) {
            System.out.print("For a package of 2lbs or less, the rate is $1.10 per 500 miles.");
        }
        else if (pounds > 2 && pounds < 6) {
            System.out.print("For a package between 2 and 6lbs, the rate is $2.20 per 500 miles.");
        }
        else if (pounds >= 6 && pounds < 10) {
            System.out.print("For a package  between 6 and 10lbs, the rate is $3.70 per 500 miles.");
        }
        else {
            System.out.print("For packages over 10lbs, the rate is $3.80 per 500 miles.");
        }
    }
}
