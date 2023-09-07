package JavaFundamentals;

public class EnergyDrinkConsumption {
    public static void main(String[] args) {
        int people = 12467;

        double percentOfHighConsumers = 0.14;

        double percentLikeCitrus = 0.64;

        int numOfHighConsumers = (int)(people * percentOfHighConsumers);

        int numOfLikeCitrus = (int)(numOfHighConsumers * percentLikeCitrus);

        System.out.print("Approximately " + numOfHighConsumers + " people surveyed out of " + people
                + " people purchased one or more energy drinks each week. Of those people, approximately " + numOfLikeCitrus
                + " people prefer citrus flavored drinks.");
    }
}
