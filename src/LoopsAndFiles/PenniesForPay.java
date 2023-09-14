package LoopsAndFiles;

import java.util.Scanner;

public class PenniesForPay {
    public static void main(String[] args) {
        int days = 0;

        int isDayValid = 0;

        double penny = 0.01;

        double pay = 0;

        double salary = 0;

        Scanner keyboard = new Scanner(System.in);
        while (isDayValid != 1) {
            System.out.print("Enter the number of days worked: ");
                days = keyboard.nextInt();

            if (days <= 0){
                System.out.print("You can not work less than 1 day.");
            }
            else {
                isDayValid = 1;
            }
        }

        System.out.println("Day     Days Pay     Total Pay\n------------------------------");

        for (int i = 1; i <= days; i++) { //O(n)
            pay = i * penny;
            salary = salary + pay;
            System.out.println(i + "       " + String.format("%.2f", pay) + "         " + String.format("%.2f", salary));
        }

        System.out.print("After " + days + " you earned $" + String.format("%.2f", salary));
    }
}
