package LoopsAndFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHeadDisplay {
    public static void main(String [] args){
        int count = 0;
        String path = "";
        String line;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the file you would like to read: ");
            path = keyboard.nextLine();

        File file = new File("src/LoopsAndFiles/" + path);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null && count < 5){
                System.out.println(line);
                count++;
            }
            bufferedReader.close();
        }
        catch (IOException ioe){
            System.out.print(ioe);
        }
    }
}
