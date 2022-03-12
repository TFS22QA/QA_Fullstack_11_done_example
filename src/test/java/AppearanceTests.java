import org.junit.jupiter.api.Test;
import person.models.appearance.Appearance;
import person.models.appearance.Hair;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppearanceTests {

    @Test
    void testToString() {
        assertEquals(String.format("Eyes:\t1%nHair:\tno"),
                new Appearance("1", new Hair(0, "")).toString());
    }
}
