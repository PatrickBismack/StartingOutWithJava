package LoopsAndFiles;

import java.io.*;
import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        int distance;

        int speed;

        int time;

        File file = new File("src/LoopsAndFiles/distanceTraveled.txt");

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the speed of the vehicle (mph): ");
            speed = keyboard.nextInt();

        System.out.print("Enter the number of hours traveled: ");
            time = keyboard.nextInt();

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println("Hour        Distance Traveled \n------------------------------");
            for (int i = 1; i <= time; i++) { //O(n)
                distance = speed * i;

                printWriter.println(i + "           " + distance);
            }
            printWriter.close();
        }
        catch (IOException ioException) {
            System.out.print(ioException);
            System.exit(1);
        }
    }
}
