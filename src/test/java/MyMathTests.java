import org.junit.jupiter.api.Test;
import utils.MyMath;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTests {
    @Test
    void zero() {
        assertEquals(0, MyMath.getDigitsSum(0));
    }

    @Test
    void simpleNumber() {
        assertEquals(10, MyMath.getDigitsSum(1234));
    }

    @Test
    void negativeNumber() {
        assertEquals(10, MyMath.getDigitsSum(-1234));
    }

    @Test
    void nineNines() {
        assertEquals(81, MyMath.getDigitsSum(999999999));
    }
}
