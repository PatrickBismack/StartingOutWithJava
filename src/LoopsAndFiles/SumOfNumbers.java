package LoopsAndFiles;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int number;

        int sum = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive nonzero integer: ");
            number = keyboard.nextInt();

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        System.out.print("The sum of all natural numbers to " + number + " is " + sum);
    }
}
