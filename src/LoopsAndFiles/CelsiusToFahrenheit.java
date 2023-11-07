package LoopsAndFiles;

public class CelsiusToFahrenheit {
    public static void main(String [] args){
        double fahrenheit;

        for(int celsius = 0; celsius < 21; celsius++){
            fahrenheit = (9 / 5) * celsius + 32;

            System.out.println("Celsius Temperature: " + celsius + " degrees is " + fahrenheit + " degrees Fahrenheit.");
        }
    }
}
