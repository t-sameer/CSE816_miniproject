import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, calculator.squareRoot(25.0), 0.001);
        assertEquals(2.0, calculator.squareRoot(4.0), 0.001);

        // Edge case: Negative number should throw exception
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1.0));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));

        // Edge case: Negative number should throw exception
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-5));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0.0, calculator.naturalLog(1.0), 0.001);
        assertEquals(2.302, calculator.naturalLog(10.0), 0.001);

        // Edge case: Log of zero or negative number should throw exception
        assertThrows(IllegalArgumentException.class, () -> calculator.naturalLog(0.0));
        assertThrows(IllegalArgumentException.class, () -> calculator.naturalLog(-5.0));
    }
}