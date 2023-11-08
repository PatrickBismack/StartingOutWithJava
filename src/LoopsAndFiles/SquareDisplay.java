package LoopsAndFiles;

import java.util.Scanner;

public class SquareDisplay {
    public static void main (String [] args){
        int size;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 15: ");
            size = keyboard.nextInt();

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
