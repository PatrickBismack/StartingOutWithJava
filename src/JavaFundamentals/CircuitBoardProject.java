package JavaFundamentals;

import java.util.Scanner;

public class CircuitBoardProject {
    public static void main (String [] args){
        double profitPercent = 0.4;

        double profit;

        double retailPrice;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the cost of circuit board: $");
            retailPrice = keyboard.nextDouble();

            profit = retailPrice * profitPercent;

            System.out.println("The circuit board cost $" + retailPrice + ". With a " + (profitPercent  * 100) + "% profit margin, the company makes $"
                    + profit + " per circuit board.");
    }
}
