package LoopsAndFiles;

import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {
        String word;

        String character;

        int num = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string: ");
            word = keyboard.nextLine();

        System.out.print("Enter a character: ");
            character = String.valueOf(keyboard.next().charAt(0));

        if (word.contains(character) == true) {
            for (int i = 0; i < word.length(); i++) { //O(n)
                if (word.charAt(i) == character.charAt(0)) {
                    num = num + 1;
                }
            }
        }

        System.out.print("There are " + num + " " + character + " in the string " + word);
    }
}
