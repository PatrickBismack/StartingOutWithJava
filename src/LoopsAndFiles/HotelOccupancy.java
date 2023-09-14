package LoopsAndFiles;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        double occupancyRate = 0.0;

        int floors =0;

        int rooms = 0;

        int roomsVacant = 0;

        int totalOccupied = 0;

        int totalRooms = 0;

        int roomsOccupied;

        Scanner keyboard = new Scanner(System.in);
        while (floors < 1) {
            System.out.print("Enter the number of floors: ");
            floors = keyboard.nextInt();

            if (floors < 1) {
                System.out.println("There must be at least 1 floor.");
            }
        }

        for (int i = 0; i < floors; i++) { //O(n)
            while (rooms < 10) {
                System.out.println("On floor " + (i + 1) + ", how many rooms are there? ");
                rooms = keyboard.nextInt();

                if (rooms < 10) {
                    System.out.println("There must be at least 10 rooms per floor.");
                }
            }

            System.out.println("How many of the rooms are occupied? ");
                roomsOccupied = keyboard.nextInt();

                totalRooms = totalRooms + rooms;
                totalOccupied = totalOccupied + roomsOccupied;
                occupancyRate = (double)totalOccupied  / totalRooms;
                roomsVacant = totalRooms - totalOccupied;
        }
        System.out.print("The hotel has " + totalRooms + " rooms, " + totalOccupied + " are occupied, " + roomsVacant
                + " are vacant and there is a occupancy rate of " + String.format("%.2f", (occupancyRate * 100)) + "%.");
    }
}
