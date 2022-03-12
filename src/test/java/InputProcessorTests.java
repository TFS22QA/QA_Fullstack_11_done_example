import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputProcessorTests {

    private final InputProcessor processor = new InputProcessor();

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "a", "1", "12", "123", "12345", "123a", "1 2", "123 "})
    void processInputInvalid(final String input) {
        assertEquals("Invalid input.", processor.processInput(input));
    }

    @Test
    @DisplayName("0000")
    void processInputMin() {
        assertEquals("0000\n"
                        + "Aksyonova Alisa Alekseevna\n"
                        + "Age:10\n"
                        + "Weight:30 kg\n"
                        + "Height:1.0 m\n"
                        + "Eyes:blue\n"
                        + "Hair:no\n"
                        + "Phone:N/A",
                processor.processInput("0000").replaceAll("[\r\t]", ""),
                "Invalid output for input 0000");
    }


    @Test
    @DisplayName("9999")
    void processInputMax() {
        assertEquals("9999\n"
                        + "Shchukina Yuliya Yaroslavovna\n"
                        + "Age:100\n"
                        + "Weight:120 kg\n"
                        + "Height:1.9 m\n"
                        + "Eyes:different\n"
                        + "Hair:long, blue\n"
                        + "Phone:N/A",
                processor.processInput("9999").replaceAll("[\r\t]", ""),
                "Invalid output for input 9999");
    }

    @Test
    @DisplayName("2379")
    void processInputRandom() {
        String testString = processor.processInput("2379").replaceAll("[\r\t]", "");
        assertAll("2379",
                () -> assertEquals("2379\n"
                        + "Putin Gennadiy Ramzanovich\n"
                        + "Age:40\n"
                        + "Weight:60 kg\n"
                        + "Height:1.3 m\n"
                        + "Eyes:gray\n"
                        + "Hair:long, green\n",
                        testString.substring(0,testString.indexOf("Phone"))),
                () -> assertEquals("2379",
                        testString.substring(testString.length()-4))
        );
    }
}
