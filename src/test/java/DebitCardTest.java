import PaymentCards.DebitCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard(5.0, 1000);
    }

    @Test
    public void checkBalance() {
        assertEquals(1000, debitCard.getBalance(), 0.01);
    }

    @Test
    public void testFixedPercentage() {
        assertEquals(5.0, debitCard.getFixedPercentage(), 0.01);
    }

}
