package LoopsAndFiles;

import java.util.ArrayList;
import java.util.Scanner;

public class BarChart {
   public static void main(String [] args){
       int[] storeSales = new int[5];

       Scanner keyboard = new Scanner(System.in);

       for(int i = 0; i < 5; i++){
           System.out.print("Enter today's sales for store " + (i + 1) + " : ");
                storeSales[i]  = keyboard.nextInt();
       }
       System.out.println("\nSALES BAR CHART");
       for(int i = 0; i < 5; i++){
           System.out.print("Store " + (i + 1) + ": ");
           for(int j = 0; j < Math.floor(storeSales[i] / 100); j++){
               System.out.print("*");
           }
           System.out.println();
       }
   }
}
