package JavaFundamentals;

public class SalesPrediction {
    public static void main(String[] args) {
        double percent = 0.62;

        double sales = 4600000;

        double eastCoastSales = sales * percent;

        System.out.print("The east coast division will generate $" + eastCoastSales);
    }
}
