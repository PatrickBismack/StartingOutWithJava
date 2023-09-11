package DecisionStructures;

import java.util.Scanner;

public class MassAndWeight {
    public static void main(String[] args) {
        double mass;

        double weight;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the mass (kg) of an object: ");
            mass = keyboard.nextDouble();

            weight = mass * 9.8;

            if(weight < 1000 && weight > 10) {
                System.out.print("The weight of an object with mass of " + mass + " kg is " + weight + " newtons.");
            }
            else if (weight >= 1000) {
                System.out.print("This object is too heavy to calculate.");
            }
            else {
                System.out.print("This object is too light to calculate.");
            }
    }
}
