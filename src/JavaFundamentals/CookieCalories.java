package JavaFundamentals;

import java.util.Scanner;

public class CookieCalories {
    public static void main (String [] args){
        int bag = 40;

        int servings = 10;

        int servingCalories = 300;

        int cookies;

        double cookiesPerServing = bag / servings;

        double totalCaloriesEaten;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of cookies eaten: ");
            cookies = keyboard.nextInt();

            totalCaloriesEaten = (cookies / cookiesPerServing)  * servingCalories;

        System.out.println("You ate " + cookies + " cookies which is " + totalCaloriesEaten + " calories.");
    }
}
