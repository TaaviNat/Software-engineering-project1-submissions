import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringManipulatorTaaviTest {
    private StringManipulatorTaavi stringManipulator;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Before Class - Initializing resources...");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After Class - Cleaning up resources...");
    }

    @Before
    public void setUp() throws Exception {
        stringManipulator = new StringManipulatorTaavi();
        System.out.println("Before Test - Setting up resources...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After Test - Cleaning up resources...");
    }

    @Test
    public void testReverse() {
        assertEquals("cba", stringManipulator.reverse("abc"));
    }

    @Test
    public void testReverseEmptyString() {
        assertEquals("", stringManipulator.reverse(""));
    }

    @Test
    public void testCapitalize() {
        assertEquals("HELLO", stringManipulator.capitalize("hello"));
    }

    @Test
    public void testCapitalizeEmptyString() {
        assertEquals("", stringManipulator.capitalize(""));
    }
}
