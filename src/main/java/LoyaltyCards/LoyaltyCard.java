package LoyaltyCards;

import PaymentCards.IChargable;

public class LoyaltyCard implements IChargable {

    private double balance;

    public LoyaltyCard(double balance) {
        this.balance = balance;
    }

    public double getTransactionCost(double purchaseAmount) {
        return 0;
    }

    public void charge(double purchaseAmount) {

    }

    public double getFixedPercentage() {
        return 0;
    }

    public void setFixedPercentage(double fixedPercentage) {

    }

    public boolean checkAuthorisation() {
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
