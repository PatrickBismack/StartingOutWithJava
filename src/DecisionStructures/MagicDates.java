package DecisionStructures;

import java.util.Scanner;

public class MagicDates {
    public static void main (String [] args){
        int date;

        int month;

        int year;

        int magicNum;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the digit for the month: ");
            month = keyboard.nextInt();

        System.out.print("Enter the digit for the date: ");
            date = keyboard.nextInt();

        System.out.print("Enter the last two digits of the year: ");
            year = keyboard.nextInt();

        magicNum = date * month;

        if(magicNum == year){
            System.out.print("The date is magic!");
        }
        else{
            System.out.print("The date is not magic.");
        }
    }
}
