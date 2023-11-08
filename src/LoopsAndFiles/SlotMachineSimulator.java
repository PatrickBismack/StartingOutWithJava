package LoopsAndFiles;

import java.util.Scanner;

public class SlotMachineSimulator {
    public static void main (String [] args){
        int max = 5;
        int min = 0;
        int range = max - min + 1;
        int random = (int)(Math.random() * range);

        double moneyIn;
        double totalMoney = 0;
        double totalWon = 0;

        String symbol = "";
        String symbol1 = "";
        String symbol2 = "";
        String symbol3 = "";
        String play = "";

        boolean isPlaying = true;
        boolean isValid = true;

        Scanner keyboard = new Scanner(System.in);

        while(isPlaying == true) {
            System.out.print("Please enter the amount of money you would like to enter into the slot machine: $");
                moneyIn = keyboard.nextDouble();
                totalMoney = totalMoney + moneyIn;

            for(int i = 0; i < 3; i++){
                if(random == 0){
                    symbol = "Cherries";
                }
                else if(random == 1){
                    symbol = "Oranges";
                }
                else if(random == 2){
                    symbol = "Plums";
                }
                else if(random == 3){
                    symbol = "Bells";
                }
                else if(random == 4){
                    symbol = "Melons";
                }
                else if(random == 5){
                    symbol = "Bars";
                }
                random = (int)(Math.random() * range);

                if(i == 0){
                    symbol1 = symbol;
                }
                else if(i == 1){
                    symbol2 = symbol;
                }
                else if(i == 2){
                    symbol3 = symbol;
                }
            }
            System.out.println(symbol1 + " " + symbol2 + " " + symbol3);


            if (symbol1.equalsIgnoreCase(symbol2) && symbol1.equalsIgnoreCase(symbol3)) {
                moneyIn = moneyIn * 3;
                System.out.println("You won $" + moneyIn);
                totalWon = totalWon + moneyIn;
            }
            else if (symbol1.equalsIgnoreCase(symbol2) || symbol1.equalsIgnoreCase(symbol3)){
                moneyIn = moneyIn * 2;
                System.out.println("You won $" + moneyIn);
                totalWon = totalWon + moneyIn;
            }
            else{
                System.out.println("You won $0");
            }
            keyboard.nextLine();

            System.out.println("Would you like to play again? y for yes and n for no");
                play = keyboard.nextLine();
            while(isValid == true) {
                if (play.equalsIgnoreCase("n") || play.equalsIgnoreCase("no")) {
                    isPlaying = false;
                    isValid = false;
                }
                else if (play.equalsIgnoreCase("y") || play.equalsIgnoreCase("yes")) {
                    isPlaying = true;
                    isValid = false;
                }
                else {
                    System.out.println("That is not a valid option, please enter again: ");
                        play = keyboard.nextLine();
                }
            }
            isValid = true;
        }
        System.out.print("You spent $" + totalMoney + ", and won $" + totalWon + ". Your net was $" + (totalWon - totalMoney));
    }
}
