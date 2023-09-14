package LoopsAndFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileLetterCounter {
    public static void main(String[] args) {
        int num = 0;

        String character;

        String pickedFile;

        String line;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a text file name: ");
        pickedFile = keyboard.nextLine();

        System.out.print("Enter a character: ");
            character = String.valueOf(keyboard.nextLine().toLowerCase().charAt(0));

        File file = new File("src/LoopsAndFiles/" + pickedFile);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader); //O(n * m)

            while((line = bufferedReader.readLine()) != null) {
                line = line.toLowerCase();

                if (line.contains(character)) {
                    for (int i = 0; i < line.length(); i++) {
                        if (line.charAt(i) == character.charAt(0)) {
                            num = num + 1;
                        }
                    }
                }
            }
            bufferedReader.close();
            System.out.print("The file " + pickedFile + " contains " + num + " " + character + ".");
        }
        catch (IOException ioe) {
            System.out.print(ioe);
        }
    }
}
