import LoyaltyCards.LoyaltyCard;
import PaymentCards.DebitCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoyaltyCardTest {

    LoyaltyCard loyaltyCard;

    @Before
    public void before() {
        loyaltyCard = new LoyaltyCard(1000);
    }

    @Test
    public void checkBalance() {
        assertEquals(1000, loyaltyCard.getBalance(), 0.01);
    }

}
