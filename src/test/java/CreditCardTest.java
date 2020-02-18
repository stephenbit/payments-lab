import PaymentCards.CreditCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard(5.0, 1000, 2.0);
    }

    @Test
    public void checkBalance() {
        assertEquals(1000, creditCard.getBalance(), 0.01);
    }

    @Test
    public void testFixedPercentage() {
        assertEquals(5.0, creditCard.getFixedPercentage(), 0.01);
    }

    @Test
    public void testRiskMultiplier() {
        assertEquals(2.0, creditCard.getRiskMultiplier(), 0.01);
    }
}
