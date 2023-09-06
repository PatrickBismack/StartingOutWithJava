package JavaFundamentals;

import java.util.Scanner;

public class SalesTax {
    public static void main (String [] args){
        double stateTax = 0.04;

        double countryTax = 0.02;

        double amount;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the purchase amount: ");
            amount = keyboard.nextDouble();
        System.out.println("The purchase amount was $" + amount + ", the state sales tax was $" + (stateTax * amount)
                + ", the country sales tax was $" + (countryTax * amount) + ", the total tax was $" + ((stateTax + countryTax) * amount)
                + ", the final purchase price was $" + (amount + ((stateTax + countryTax) * amount)));

    }
}
