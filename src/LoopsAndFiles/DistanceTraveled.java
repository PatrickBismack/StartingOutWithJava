package LoopsAndFiles;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        int distance;

        int speed;

        int time;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the speed of the vehicle (mph): ");
            speed = keyboard.nextInt();

        System.out.print("Enter the number of hours traveled: ");
            time = keyboard.nextInt();

        System.out.println("Hour        Distance Traveled \n------------------------------");
        for (int i = 1; i <= time; i++) {
            distance = speed * i;

            System.out.println(i + "           " + distance);
        }
    }
}
