package JavaFundamentals;

import java.util.Scanner;

public class MaleAndFemalePercentages {
    public static void main (String [] args){
        int females;

        int males;

        int totalStudents;

        double femalePercentage;

        double malePercentage;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of males in your class: ");
        males = keyboard.nextInt();

        System.out.print("Enter the number of females in your class: ");
        females = keyboard.nextInt();

        totalStudents = males + females;
        malePercentage = ((double)males / totalStudents) * 100;
        femalePercentage = ((double)females / totalStudents) * 100;

        System.out.println("There are " + males + " males and " + females + " females in you class which is " + totalStudents
                + " people. The class is made up of " + malePercentage + "% male and " + femalePercentage + "% female.");
    }
}
