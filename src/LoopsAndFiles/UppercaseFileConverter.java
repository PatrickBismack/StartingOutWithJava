package LoopsAndFiles;

import java.io.*;
import java.util.Scanner;

public class UppercaseFileConverter {
    public static void main(String [] args){
        String line;
        String file1 = "";
        String file2 = "";

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the name of the first file: ");
            file1 = keyboard.nextLine();

        System.out.print("Enter the name of the second file: ");
            file2 = keyboard.nextLine();

        File fileLower = new File("src/LoopsAndFiles/" + file1);
        File fileUpper = new File("src/LoopsAndFiles/" + file2);

        try{
            FileReader fileReader = new FileReader(fileLower);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(fileUpper);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            while((line = bufferedReader.readLine()) != null){
                printWriter.println(line.toUpperCase());
            }
            bufferedReader.close();
            printWriter.close();
        }
        catch (IOException ioe){
            System.out.print(ioe);
        }
    }
}
