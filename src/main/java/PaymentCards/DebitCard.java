package PaymentCards;

public class DebitCard extends PaymentCard implements IChargable {

    public DebitCard(double fixedPercentage, double balance) {
        super(fixedPercentage, balance);
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

}
