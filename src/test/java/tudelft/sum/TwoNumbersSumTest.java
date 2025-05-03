package tudelft.sum;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {

    // Test 1: Suma simple sin acarreo (12 + 23 = 35)
    @Test
    public void testSimpleSumNoCarry() {
        TwoNumbersSum calculator = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(2, 3));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 5));

        assertEquals(expected, calculator.addTwoNumbers(first, second));
    }

    // Test 2: Suma con acarreo (57 + 68 = 125)
    @Test
    public void testSumWithCarry() {
        TwoNumbersSum calculator = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(5, 7));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(6, 8));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 5));

        assertEquals(expected, calculator.addTwoNumbers(first, second));
    }

    // Test 3: Suma de un número con más dígitos que otro (123 + 4 = 127)
    @Test
    public void testUnequalLengths() {
        TwoNumbersSum calculator = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 7));

        assertEquals(expected, calculator.addTwoNumbers(first, second));
    }

    // Test 4: Suma con múltiples acarreos (99 + 99 = 198)
    @Test
    public void testMultipleCarries() {
        TwoNumbersSum calculator = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(9, 9));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 9, 8));

        assertEquals(expected, calculator.addTwoNumbers(first, second));
    }

    // Test 5: Suma con un número cero (0 + 456 = 456)
    @Test
    public void testZeroInput() {
        TwoNumbersSum calculator = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 5, 6));

        assertEquals(expected, calculator.addTwoNumbers(first, second));
    }
}
