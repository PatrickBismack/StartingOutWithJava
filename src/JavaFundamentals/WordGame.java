package JavaFundamentals;

import java.util.Scanner;

public class WordGame {
    public static void main (String [] args){
        String name;

        String age;

        String city;

        String college;

        String profession;

        String animal;

        String pet;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a name: ");
            name = keyboard.nextLine();

        System.out.print("Enter an age: ");
            age = keyboard.nextLine();

        System.out.print("Enter a city: ");
            city = keyboard.nextLine();

        System.out.print("Enter a college: ");
            college = keyboard.nextLine();

        System.out.print("Enter a profession: ");
            profession = keyboard.nextLine();

        System.out.print("Enter an animal: ");
            animal = keyboard.nextLine();

        System.out.print("Enter the name of a pet: ");
            pet = keyboard.nextLine();

        System.out.print("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ",\n" + name
                + " went to college at " + college + ". " + name + " graduated and went to work as a \n" + profession + ". Then, " + name
                + " adopted a(n) " + animal + " named " + pet + ". They both lived\nhappily ever after!");
    }
}