package JavaFundamentals;

public class LandCalculation {
    public static void main (String [] args){
        int acre = 43560;

        int tract = 389767;

        double numOfAcres = tract / acre;

        System.out.print("The number of acres in " + tract + " square feet is " + numOfAcres + " square feet.");
    }
}
