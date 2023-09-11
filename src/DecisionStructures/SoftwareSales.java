package DecisionStructures;

import java.util.Scanner;

public class SoftwareSales {
    public static void main(String[] args) {
        int quantity;

        double cost;

        double item = 99;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the quantity you want to purchase: ");
            quantity = keyboard.nextInt();

        if (quantity < 10 ) {
            cost = quantity * item;
            System.out.print("There is no discount on " + quantity + " packages, your total is $" + cost + ".");
        }
        else if (quantity >= 10 && quantity <= 19) {
            cost = quantity * (item * .2);
            System.out.print("There is a 20% discount on " + quantity + " packages, your total is $" + cost + ".");
        }
        else if (quantity >= 20 && quantity <= 49) {
            cost = quantity * (item * .3);
            System.out.print("There is a 30% discount on " + quantity + " packages, your total is $" + cost + ".");
        }
        else if (quantity >= 50 && quantity <= 99) {
            cost = quantity * (item *.4);
            System.out.print("There is a 40% discount on " + quantity + " packages, your total is $" + cost + ".");
        }
        else if (quantity >= 100) {
            cost = quantity * (item *.5);
            System.out.print("There is a 50% discount on " + quantity + " packages, your total is $" + cost + ".");
        }
    }
}
