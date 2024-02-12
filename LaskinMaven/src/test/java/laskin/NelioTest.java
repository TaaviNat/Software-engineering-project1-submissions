package laskin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NelioTest {

    private Laskin laskin = new Laskin();
    private final double DELTA = 0.001;

    @ParameterizedTest(name = "Luvun {0} neliö on {1}")
    @CsvSource({ "0, 0", "1, 1", "2, 4", "4, 16", "5, 25", "6, 36" })
    public void testSquare(int aNum, int result) {
        laskin.square(aNum); // Assuming you have a method 'square' in your Laskin class
        assertEquals(result, laskin.returnResult(), DELTA, "Squaring operation is incorrect");
    }
}
