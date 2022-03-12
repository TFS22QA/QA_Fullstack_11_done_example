import org.junit.jupiter.api.Test;
import person.Person;
import person.models.Physical;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PhysicalTests {

    @Test
    void testToString() {
        assertEquals(String.format("Age:\t%1$s%nWeight:\t%2$s kg%nHeight:\t%3$s m", 1, 2, 1.2),
                new Physical(1,2,1.2).toString());
    }
}
