package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTest {
    @Test
    public void totalIsBiggerThanAmountOfBars() {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(1, 1, 5);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void onlyBigBars() {
        int result = new ChocolateBags().calculate(1, 1, 6);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void bigAndSmallBars() {
        int result = new ChocolateBags().calculate(1, 1, 7);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void onlySmallBars() {
        int result = new ChocolateBags().calculate(1, 1, 8);
        Assertions.assertEquals(-1, result);
    }
}
