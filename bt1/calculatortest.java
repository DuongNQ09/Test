import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testAddZero() {
        assertEquals(3, calculator.add(3, 0));
    }
}
