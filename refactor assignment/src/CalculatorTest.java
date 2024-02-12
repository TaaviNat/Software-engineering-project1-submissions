import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator cal;

    @Before
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, cal.add(2, 3));
    }

    @Test
    public void testProduct() {
        assertEquals(6, cal.multiply(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, cal.subtract(3, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(2, cal.divide(6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        cal.divide(6, 0);
    }
}