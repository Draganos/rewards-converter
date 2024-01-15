public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035); // Convert cash to miles
    }


    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Convert miles to cash
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        RewardValue rewardFromCash = new RewardValue(100.0);
        System.out.println("Cash Value: $" + rewardFromCash.getCashValue());
        System.out.println("Miles Value: " + rewardFromCash.getMilesValue() + " miles");

        RewardValue rewardFromMiles = new RewardValue(50000);
        System.out.println("Cash Value: $" + rewardFromMiles.getCashValue());
        System.out.println("Miles Value: " + rewardFromMiles.getMilesValue() + " miles");
    }
}
