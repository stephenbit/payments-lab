package PaymentCards;

public class CreditCard extends PaymentCard implements IChargable {

    private double riskMultiplier;

    public CreditCard(double fixedPercentage, double balance, double riskMultiplier) {
        super(fixedPercentage, balance);
        this.riskMultiplier = riskMultiplier;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0;
    }

    public void charge(double purchaseAmount) {

    }

    public double getFixedPercentage() {
        return fixedPercentage;
    }

    public void setFixedPercentage(double fixedPercentage) {

    }

    public boolean checkAuthorisation() {
        if (this.balance >= 1) {
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public double getRiskMultiplier() {
        return riskMultiplier;
    }

}
