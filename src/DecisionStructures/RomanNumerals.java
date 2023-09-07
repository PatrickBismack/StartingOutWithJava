package DecisionStructures;

import java.util.Scanner;

public class RomanNumerals {
    public static void main (String [] args){
        int num;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a whole number between 1 and 10 to convert it to its roman numeral form: ");
            num = keyboard.nextInt();

        if(num >= 1 && num <= 10){
            switch(num){
                case 1:
                    System.out.print("I");
                break;
                case 2:
                    System.out.print("II");
                break;
                case 3:
                    System.out.print("III");
                break;
                case 4:
                    System.out.print("IV");
                break;
                case 5:
                    System.out.print("V");
                break;
                case 6:
                    System.out.print("VI");
                case 7:
                    System.out.print("VII");
                break;
                case 8:
                    System.out.print("VIIII");
                break;
                case 9:
                    System.out.print("IX");
                break;
                case 10:
                    System.out.print("X");
                break;
            }
        }
        else{
            System.out.println(num + " is not a valid number.");
        }
    }
}
