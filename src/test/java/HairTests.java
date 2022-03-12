import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import person.models.appearance.Hair;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HairTests {

    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    void zeroLengthToString(final int length) {
        assertEquals("no", new Hair(length, "black").toString());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void shortToString(final int length) {
        assertEquals("short, black", new Hair(length, "black").toString());
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 6})
    void longToString(final int length) {
        assertEquals("long, black", new Hair(length, "black").toString());
    }
}
