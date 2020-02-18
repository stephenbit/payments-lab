package PaymentCards;

public interface IChargable {
    double getTransactionCost(double purchaseAmount);
    void charge(double purchaseAmount);


    public double getFixedPercentage();

    public void setFixedPercentage(double fixedPercentage);

    public boolean checkAuthorisation();

}
