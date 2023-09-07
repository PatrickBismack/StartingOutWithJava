package JavaFundamentals;

import java.util.Scanner;

public class StringManipulator {
    public static void main (String [] args){
        String city;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of your favorite ciyt: ");
            city = keyboard.nextLine();

        System.out.println(city + " has " + city.length() + " characters and the first character is " + city.charAt(0) + ". All uppercase looks like this " + city.toUpperCase()
                + " and all lowercase looks like this " + city.toLowerCase() + ".");
    }
}
