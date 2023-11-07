package LoopsAndFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineNumbers {
    public static void main(String [] args){
        String path = "";
        String line;
        int lineNumber = 1;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the file you would like to read: ");
            path = keyboard.nextLine();

        File file = new File("src/LoopsAndFiles/" + path);

        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null){
                System.out.println(lineNumber + " " + line);
                lineNumber++;
            }
        }
        catch (IOException ioe){
            System.out.print(ioe);
        }
    }
}
