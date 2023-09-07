package JavaFundamentals;

public class StockCommission {
    public static void main(String [] args) {
        int shares = 600;

        double pricePerShare = 21.77;

        double commission = 0.02;

        double costWithoutCommission = shares * pricePerShare;

        double commissionAmount = costWithoutCommission * commission;

        double costWithCommission = costWithoutCommission + commissionAmount;

        System.out.print("For " + shares + " shares purchased at $" + pricePerShare + " per share, the total cost was $" + costWithoutCommission
                + ". With a commission rate of " + (commission * 100) + "% you owe the broker $" + commissionAmount + ". Your final amount is $"
                + costWithCommission);
    }
}
