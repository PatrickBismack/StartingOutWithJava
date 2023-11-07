package LoopsAndFiles;

import java.util.Scanner;

public class ESP {
    public static void main (String [] args){
        int count = 0;
        int min = 0;
        int max = 4;
        int range = max - min + 1;
        String guess = "";
        String color = "";
        int number = (int)(Math.random() * range) + min;
        boolean isValid = false;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("You will see how many times you can guess correctly the selected color.\nThe colors you can choose from are Red, Green, " +
                "Blue, Orange, and Yellow.\n");

        for(int i = 0; i < 10; i++){
            while(isValid == false){
                System.out.print("Enter your guess: ");
                    guess = keyboard.nextLine();

                if (guess.equalsIgnoreCase("red") || guess.equalsIgnoreCase("green")|| guess.equalsIgnoreCase("blue") || guess.equalsIgnoreCase("orange") || guess.equalsIgnoreCase("yellow")){
                    isValid = true;
                }
                else {
                    System.out.print(guess + " was not a color to choose from. ");
                }
            }

            if(number == 0){
                color = "red";
            }
            else if(number == 1){
                color = "green";
            }
            else if(number == 2){
                color = "blue";
            }
            else if(number == 3){
                color = "orange";
            }
            else if(number == 4){
                color = "yellow";
            }
            if (guess.equalsIgnoreCase(color)){
                System.out.print("You guess the right color. ");
                count++;
            }
            else {
                System.out.print("You guessed the wrong color. ");
            }
            isValid = false;
            number = (int)(Math.random() * range) + min;
        }
        System.out.print("You guess " + count + " out of 10 colors correctly.");
    }
}
