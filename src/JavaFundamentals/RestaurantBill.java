package JavaFundamentals;

import java.util.Scanner;

public class RestaurantBill {
    public static void main (String [] args){

        double tax = 0.0675;

        double tip = 0.20;

        double bill;

        double totalBill;

        double taxAmount;

        double tipAmount;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter how much did your meal cost: ");
            bill = keyboard.nextDouble();

            taxAmount = bill * tax;
            tipAmount = (bill + taxAmount) * tip;
            totalBill = tipAmount + taxAmount + bill;

        System.out.println("Your bill was $" + String.format("%.2f", bill) + ", the tax was $" + String.format("%.2f", taxAmount) + ", the tip was $"
                + String.format("%.2f", tipAmount) + ", and the total was $" + String.format("%.2f", totalBill));
    }
}
