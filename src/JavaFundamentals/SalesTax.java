package JavaFundamentals;

import java.util.Scanner;

public class SalesTax {
    public static void main (String [] args){
        double stateTax = 0.04;

        double countryTax = 0.02;

        double stateTaxAmount;

        double countryTaxAmount;

        double totalTaxAmount;

        double finalPurchasePrice;

        double amount;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the purchase amount: ");
            amount = keyboard.nextDouble();

            stateTaxAmount = stateTax * amount;
            countryTaxAmount = countryTax * amount;
            totalTaxAmount = countryTaxAmount + stateTaxAmount;
            finalPurchasePrice = (amount + totalTaxAmount);

        System.out.println("The purchase amount was $" + String.format("%,.2f", amount) + ", the state sales tax was $"
                + String.format("%,.2f", stateTaxAmount) + ", the country sales tax was $" + String.format("%,.2f", countryTaxAmount)
                + ", the total tax was $" + String.format("%,.2f", totalTaxAmount) + ", the final purchase price was $"
                + String.format("%,.2f", finalPurchasePrice));
    }
}
