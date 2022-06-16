package coding.shop;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class CheckoutAcceptanceTest {

    private final Checkout checkout = new Checkout();

    @Test
    void calculateBasketPrice(){
        assertEquals(new BigDecimal("0.90"), checkout.calculatePriceOf("Apple", "Apple", "Banana"));
    }

}