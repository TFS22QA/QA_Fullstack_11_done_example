import java.nio.charset.Charset;
import java.util.Scanner;

public enum Controller {
    INSTANCE;

    private final InputProcessor processor = new InputProcessor();

    public void launch() {
        final Scanner scanner = new Scanner(System.in, Charset.defaultCharset());
        String input;
        while (true) {
            System.out.println("Print 4 digits (0-9, no spaces). Q to exit");
            input = scanner.nextLine();
            if ("q".equalsIgnoreCase(input)) {
                break;
            } else {
                System.out.println(processor.processInput(input));
                System.out.println("------------");
            }
        }
        scanner.close();
    }
}
