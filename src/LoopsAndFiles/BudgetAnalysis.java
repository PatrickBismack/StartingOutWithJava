package LoopsAndFiles;

import java.util.Scanner;

public class BudgetAnalysis {
    public static void main(String [] args){
        double budget;
        double total;
        double expense = 0;
        String choice;
        boolean hasExpenses = true;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your monthly budget: $");
            budget = keyboard.nextDouble();
            keyboard.nextLine();

        System.out.println("Do you have any expenses? y for yes and n for no");
            choice = keyboard.nextLine();

        while (hasExpenses == true){
            if(choice.equalsIgnoreCase("y") | choice.equalsIgnoreCase("yes")){
                System.out.print("Enter the expense amount: $");
                    expense = expense + keyboard.nextDouble();

                keyboard.nextLine();
                System.out.println("Do you have any expenses? y for yes and n for no");
                    choice = keyboard.nextLine();
            }
            else if(choice.equalsIgnoreCase("n") | choice.equalsIgnoreCase("no")){
                hasExpenses = false;
            }
            else {
                System.out.println("That is not a valid option. Do you have any expenses? y for yes and n for no");
                    choice = keyboard.nextLine();
            }
        }
        total = budget - expense;

        System.out.println("Your monthly budget: $" + budget + ", your total expenses were: $" + expense + " and your remaining balance is: $" + total);
    }
}
