package LoopsAndFiles;

public class DiceGame {
    public static void main (String [] args){
        int userScore = 0;
        int computerScore = 0;
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int userDice = (int)(Math.random() * range)+ 1;
        int computerDice = (int)(Math.random() * range)+ 1;

        for(int i = 0; i < 10; i++){
            if(userDice > computerDice){
                System.out.println("The user rolled a " + userDice + ", and the computer rolled a " + computerDice + ", so the user wins");
                userScore++;
            }
            else if(computerDice > userDice){
                System.out.println("The user rolled a " + userDice + ", and the computer rolled a " + computerDice + ", so the computer wins");
                computerScore++;
            }
            else{
                System.out.println("The user rolled a " + userDice + ", and the computer rolled a " + computerDice + ", so its a tie.");
            }
            userDice = (int)(Math.random() * range)+ 1;
            computerDice = (int)(Math.random() * range)+ 1;
        }

        if(computerScore > userScore){
            System.out.print("The computer won.");
        }
        else if(userScore > computerScore){
            System.out.println("The user won.");
        }
        else{
            System.out.print("It was a tie.");
        }

    }
}
