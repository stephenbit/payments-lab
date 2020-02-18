package PaymentCards;

public abstract class PaymentCard {

    protected double fixedPercentage;
    protected double balance;

    public PaymentCard(double fixedPercentage, double balance) {
        this.fixedPercentage = fixedPercentage;
        this.balance = balance;
    }


    public abstract double getBalance();
}
