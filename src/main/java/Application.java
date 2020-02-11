import calculator.Calculator;

import static io.ConsoleInput.inputExpression;
import static io.ConsoleOutput.*;

public class Application {
    public static void main(String[] args) {
        printStartMessage();

        Calculator calculator = new Calculator();
        Double userResult = calculator.run(inputExpression());

        printResult(userResult);
        printEndMessage();
    }
}
