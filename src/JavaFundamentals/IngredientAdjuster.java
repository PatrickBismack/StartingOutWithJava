package JavaFundamentals;

import java.util.Scanner;

public class IngredientAdjuster {
    public static void main(String [] args) {
        int cookies = 48;

        double sugar = 1.5;

        double butter = 1.0;

        double flour = 2.75;

        double sugarPerCookie = sugar / cookies;

        double butterPerCookie = butter / cookies;

        double flourPerCookie = flour / cookies;

        int desiredCookies;

        double neededSugar;

        double neededButter;

        double neededFlour;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many cookies would you like to make?");
            desiredCookies = keyboard.nextInt();

            neededSugar = desiredCookies * sugarPerCookie;
            neededButter = desiredCookies * butterPerCookie;
            neededFlour = desiredCookies * flourPerCookie;

        System.out.print("For " + desiredCookies + " cookies, you'll need " + String.format("%.4f", neededSugar) + " cups of sugar, "
                + String.format("%.4f", neededButter) + " cups of butter, and " + String.format("%.4f", neededFlour) + " cups of flour." );
    }
}
