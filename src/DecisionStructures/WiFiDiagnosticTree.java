package DecisionStructures;

import java.util.Scanner;

public class WiFiDiagnosticTree {
    public static void main(String[] args) {
        String answer;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("So you're having trouble with your Wi-Fi. Try to reboot the computer and try to reconnect. Did that fix it? ");
            answer = keyboard.nextLine();

        if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
            System.out.print("Try to reboot the router and try to reconnect. Did that fix the problem? ");
                answer = keyboard.nextLine();

            if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                System.out.print("Make sure the cables between the router and modem are plugged in firmly. Did that fix the problem? ");
                    answer = keyboard.nextLine();

                if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                    System.out.print("Move the router to a new location and try to reconnect. Did that fix the problem? ");
                    answer = keyboard.nextLine();

                    if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                        System.out.print("Get a new router.");
                    }
                    else {
                        System.out.print("Glad I could help.");
                    }
                }
                else {
                    System.out.print("Glad I could help.");
                }

            }
            else {
                System.out.print("Glad I could help.");
            }
        }
        else {
            System.out.print("Glad I could help.");
        }
    }
}
