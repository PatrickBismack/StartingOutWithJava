package DecisionStructures;

import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        String vegetarian;

        String vegan;

        String glutenFree;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Is anyone in your party vegetarian? ");
            vegetarian = keyboard.nextLine();

        System.out.print("Is anyone in your party vegan? ");
            vegan = keyboard.nextLine();

        System.out.print("Is anyone in your party gluten-free? ");
            glutenFree = keyboard.nextLine();

        if (vegetarian.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("yes") && glutenFree.equalsIgnoreCase("yes")) {
            System.out.print("Corner Cafe-Vegetarian\nThe Chef's Kitchen");
        }
        else if (vegetarian.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("yes") && glutenFree.equalsIgnoreCase("no")) {
            System.out.print("Corner Cafe-Vegetarian\nThe Chef's Kitchen");
        }
        else if (vegetarian.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("no") && glutenFree.equalsIgnoreCase("yes")) {
            System.out.print("Main Street Pizza Company\nCorner Cafe-Vegetarian\nThe Chef's Kitchen");
        }
        else if (vegetarian.equalsIgnoreCase("no") && vegan.equalsIgnoreCase("yes") && glutenFree.equalsIgnoreCase("yes")) {
            System.out.print("Corner Cafe-Vegetarian\nThe Chef's Kitchen");
        }
        else if (vegetarian.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("no") && glutenFree.equalsIgnoreCase("no")) {
            System.out.print("Main Street Pizza Company\nCorner Cafe-Vegetarian\nMama's Fine Italian\nThe Chef's Kitchen");
        }
        else if (vegetarian.equalsIgnoreCase("no") && vegan.equalsIgnoreCase("yes") && glutenFree.equalsIgnoreCase("no")) {
            System.out.print("Corner Cafe-Vegetarian\nThe Chef's Kitchen");
        }
        else if (vegetarian.equalsIgnoreCase("no") && vegan.equalsIgnoreCase("no") && glutenFree.equalsIgnoreCase("yes")) {
            System.out.print("Main Street Pizza Company\nCorner Cafe-Vegetarian\nThe Chef's Kitchen");
        }
        else {
            System.out.print("Joe's Gourmet Burgers\nMain Street Pizza Company\nCorner Cafe-Vegetarian\nMama's Fine Italian\nThe Chef's Kitchen");
        }
    }
}
