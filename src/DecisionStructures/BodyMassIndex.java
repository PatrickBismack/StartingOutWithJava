package DecisionStructures;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main (String [] args){
        double BMI;

        double weight;

        double height;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your height in inches: ");
            height = keyboard.nextDouble();

        System.out.print("Enter your weight in pounds: ");
            weight = keyboard.nextDouble();

        BMI = weight * (703/Math.pow(height, 2));

        if (height > 0){
            if (BMI <= 25 && BMI >= 18.5){
                System.out.print("Your BMI is " + String.format("%.2f", BMI) + " which is considered an optimal weight.");
            } else if (BMI < 18.5) {
                System.out.print("Your BMI is " + String.format("%.2f", BMI) + " which is considered an underweight.");
            }
            else {
                System.out.print("Your BMI is " + String.format("%.2f", BMI) + " which is considered an overweight.");
            }
        }
        else {
            System.out.print("The BMI was not computable for the weight of " + weight + " pounds and height of " + height + " inches. The height must be greater than 0.");
        }
    }
}
