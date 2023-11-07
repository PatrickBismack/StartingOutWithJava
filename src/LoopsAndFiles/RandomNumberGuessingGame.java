package LoopsAndFiles;

import java.util.Scanner;

public class RandomNumberGuessingGame {
    public static void main(String [] args){
        int guess;
        int max = 100;
        int min = 0;
        int range = max - min + 1;
        int number = (int)(Math.random() * range) + min;
        boolean found = false;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("A random number has been generated, enter a guess between whole number 0 to 100: ");
            guess = keyboard.nextInt();

        while(found == false){
            if(guess > number){
                if(guess < max){
                    max = guess;
                }
                System.out.println("You guessed to high. Enter another guess between whole number " + min + " to " + max + ".");
                guess = keyboard.nextInt();
            }
            else if (guess < number){
                if(guess > min){
                    min = guess;
                }
                System.out.println("You guessed to low. Enter another guess between whole number " + min + " to " + max + ".");
                guess = keyboard.nextInt();
            }
            else {
                System.out.print("You guessed the right number.");
                found = true;
            }
        }
    }
}
