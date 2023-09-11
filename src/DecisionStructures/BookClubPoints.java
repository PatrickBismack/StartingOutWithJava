package DecisionStructures;

import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        int books;

        int points;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of books you purchased this month: ");
            books = keyboard.nextInt();

            if (books <= 0) {
                System.out.print("You earned 0 points this month.");
            }
            else if (books == 1) {
                System.out.print("You earned 5 points this month.");
            }
            else if (books == 2) {
                System.out.print("You earned 15 points this month.");
            }
            else if (books == 3) {
                System.out.print("You earned 30 points this month.");
            }
            else if (books >= 4) {
                System.out.print("You earned 60 points this month.");
            }
            else {
                System.out.print("There was an error calculating how many points you earned this month.");
            }
    }
}
