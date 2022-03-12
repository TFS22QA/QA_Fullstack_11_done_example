import org.junit.jupiter.api.Test;
import person.models.Phone;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneTests {

    @Test
    void testToString() {
        assertEquals("Phone:\t123", new Phone("123").toString());
    }
}
