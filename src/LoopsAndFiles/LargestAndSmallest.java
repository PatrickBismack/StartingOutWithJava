package LoopsAndFiles;

import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int largest = 0;

        int smallest = 0;

        int num = 0;

        int count = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a sequence of integers. Once you are finished type -99.");
        while (num != -99) {
            num = keyboard.nextInt();
            count++;
            if (num != -99) {
                if (count == 1) {
                    smallest = num;
                }
                else if (count == 2) {
                    largest = num;

                    if (smallest > largest) {
                        largest = smallest;
                        smallest = num;
                    }
                }
                else if (count >= 2) {
                    if (num < smallest) {
                        smallest = num;
                    }
                    else if (num > largest) {
                        largest = num;
                    }
                }
            }
        }
        System.out.print("The smallest num is you entered was " + smallest + " and the largest was " + largest);
    }
}
