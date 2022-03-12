import person.PersonFactory;

public class InputProcessor {

    public final String processInput(final String input) {
        String result;

        if (input.trim().matches("\\d{4}")) {
            result = PersonFactory.getPerson(input).toString();
        } else {
            result = "Invalid input.";
        }
        return result;
    }
}
