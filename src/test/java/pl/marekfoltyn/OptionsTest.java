package pl.marekfoltyn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class OptionsTest {

    private Options options;

    @Before
    public void beforeTest() {
        this.options = new Options();
    }

    @Test
    public void shouldReturnAdditionResult() {
        assertEquals(options.additionTwoNumbers(2, 2), 4, 0);
        assertEquals(options.additionTwoNumbers(5, 2.6), 7.6, 0);
        assertEquals(options.additionTwoNumbers(12452, 22), 12474, 0);
        assertEquals(options.additionTwoNumbers(-3, 2), -1, 0);
        assertEquals(options.additionTwoNumbers(-0.52, 1.56), 1.04, 0);
    }

    @Test
    public void shouldReturnWrongAdditionResult() {
        assertNotEquals(options.additionTwoNumbers(2, 2), 5, 0);
    }

    @Test
    public void shouldReturnSubstractionResult() {
        assertEquals(options.substraction(5, 3), 2, 0);
    }

    @Test
    public void shouldReturnMultiplicationResult() {
        assertEquals(options.multiplication(12, 3), 36, 0);
        assertEquals(options.multiplication(12.76, 0.54), 6.8904000000000005, 0);
    }

    @Test
    public void shouldReturnDivisionResult() {
        assertEquals(options.division(9, 3), 3, 0);
        assertEquals(options.division(100, 10), 10, 0);
        assertEquals(options.division(123, 4.8), 25.625, 0);
    }

    @Test
    public void shouldReturnPercentageResult() {
        assertEquals(options.percentage(10, 100), 10, 0);
        assertEquals(options.percentage(56, 100), 56.00000000000001, 0);
        assertEquals(options.percentage(45, 100), 45, 0);
    }

    @Test
    public void shouldReturnExponantationResult() {
        assertEquals(options.exponentiation(3), 9, 0);
        assertEquals(options.exponentiation(45), 2025, 0);
        assertEquals(options.exponentiation(12), 144, 0);

    }
}