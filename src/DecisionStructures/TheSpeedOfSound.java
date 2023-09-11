package DecisionStructures;

import java.util.Scanner;

public class TheSpeedOfSound {
    public static void main(String[] args) {
        String material;

        double distance;

        double time;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the material: ");
            material = keyboard.nextLine();

        System.out.print("Enter the distance: ");
            distance = keyboard.nextDouble();

            if(material.equalsIgnoreCase("Air")) {
                time = distance / 1100;
                System.out.print("It will take " + String.format("%.2f", time) + " seconds for the sounds to reach you.");
            }
            else if (material.equalsIgnoreCase("Water")) {
                time = distance / 4900;
                System.out.print("It will take " + String.format("%.2f", time)  + " seconds for the sounds to reach you.");
            }
            else if (material.equalsIgnoreCase("Steel")) {
                time = distance / 16400;
                System.out.print("It will take " + String.format("%.2f", time)  + " seconds for the sounds to reach you.");
            }
            else {
                System.out.print(material + " is not a supported material.");
            }
    }
}
