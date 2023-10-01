import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(4, calculator.add(2, 2));
        assertEquals(-2, calculator.add(5, -7));
    }

    @Test
    public void testSubtraction() {
        assertEquals(3, calculator.subtract(5, 2));
        assertEquals(10, calculator.subtract(5, -5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-15, calculator.multiply(3, -5));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(10, 5), 0.001);
        assertEquals(0.0, calculator.divide(0, 5), 0.001);
        // Add more division test cases, including handling divide by zero scenarios.
    }
}
