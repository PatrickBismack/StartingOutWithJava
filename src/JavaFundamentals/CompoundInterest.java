package JavaFundamentals;

import java.util.Scanner;

public class CompoundInterest {
    public static void main (String [] args) {
        double amountOfMoney;

        double principal;

        double annualInterest;

        int numOfCalculations;

        double years;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount of principal: $");
        principal = keyboard.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        annualInterest = keyboard.nextDouble() / 100;

        System.out.print("Enter the number of times per year the interest is compounded: ");
        numOfCalculations = keyboard.nextInt();

        System.out.print("Enter the number of years it will be left int the account: ");
        years = keyboard.nextDouble();

        amountOfMoney = principal * Math.pow((1 + (annualInterest / numOfCalculations)), (numOfCalculations * years));

        System.out.print("After " + years + " years, there will be $" + String.format("%.2f", amountOfMoney) + " based on the interest rate of "
                + (annualInterest * 100) + "% and is compounded " + numOfCalculations + " times each year.");
    }
}
