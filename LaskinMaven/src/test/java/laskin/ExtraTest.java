package laskin;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExtraTest extends AbstractParent {

    private static Laskin laskin = new Laskin();
    private final double DELTA = 0.001;

    @BeforeAll
    public static void setUp() {
        System.out.println("@BeforeAll current ON (Prior to the first test)");
        laskin.currentON();
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("@AfterAll current OFF (all the tests are done).");
        laskin.currentOFF();
        laskin = null;
    }

    @BeforeEach
    public void setZero() {
        System.out.println("  set to zero laskin.");
        laskin.setZero();
        assertEquals(0, laskin.returnResult(), DELTA, "Set to zero does not work");
    }

    @Test
    public void testSquareroot2() {
        laskin.squareroot(2);
        assertEquals(Math.sqrt(2), laskin.returnResult(), DELTA, "Square root of 2 is wrong");
    }

    @Test
    public void testQuadrilateral4() {
        laskin.quadrilateral(4);
        assertEquals(16, laskin.returnResult(), DELTA, "The number 4 Quadrilateral is wrong");
    }

    @Test
    public void testQuadrilateral5() {
        laskin.quadrilateral(5);
        assertEquals(25, laskin.returnResult(), DELTA, "The number 5 Quadrilateral is wrong");
    }

    @Test
    @DisplayName("Test the square root of a negative number")
    public void testNegSquareroot() {
        assertThrows(IllegalArgumentException.class, () -> laskin.squareroot(-2));
    }
}
