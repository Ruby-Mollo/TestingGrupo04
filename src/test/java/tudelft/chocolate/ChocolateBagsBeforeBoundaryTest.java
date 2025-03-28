package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChocolateBagsBeforeBoundaryTest {
    @Test
    public void totalIsBiggerThanAmountOfBars() {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(1, 1, 5);
        assertEquals(0, result);
    }

    @Test
    public void onlyBigBars() {
        int result = new ChocolateBags().calculate(1, 1, 6);
        assertEquals(1, result);
    }

    @Test
    public void bigAndSmallBars() {
        int result = new ChocolateBags().calculate(1, 1, 7);
        assertEquals(-1, result);
    }

    @Test
    public void onlySmallBars() {
        int result = new ChocolateBags().calculate(1, 1, 8);
        assertEquals(-1, result);
    }
}
