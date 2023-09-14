package LoopsAndFiles;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int number;

        int sum = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive nonzero integer: ");
            number = keyboard.nextInt();

        /*for (int i = 1; i <= number; i++) { //O(n)
            sum = sum + i;
        }*/

        sum = (number * (number + 1))/2; //O(1)

        System.out.print("The sum of all natural numbers to " + number + " is " + sum);
    }
}
