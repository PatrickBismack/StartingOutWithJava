package DecisionStructures;

import java.util.Scanner;

public class SortedNames {
    public static void main(String[] args) {
        String name1;

        String name2;

        String name3;

        String temp;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first name: ");
            name1 = keyboard.nextLine();

        System.out.print("Enter the second name: ");
            name2 = keyboard.nextLine();

        System.out.print("Enter the third name: ");
            name3 = keyboard.nextLine();

        if (name1.compareToIgnoreCase(name2) > 0) {
            temp = name2;
            name2 = name1;
            name1 = temp;
        }
        if (name2.compareToIgnoreCase(name3) > 0) {
            temp = name2;
            name2 = name3;
            name3 = temp;
        }
        if (name1.compareToIgnoreCase(name2) > 0) {
            temp = name1;
            name1 = name2;
            name2 = temp;
        }
        System.out.print(name1 + "\n" + name2 + "\n" + name3);
    }
}
