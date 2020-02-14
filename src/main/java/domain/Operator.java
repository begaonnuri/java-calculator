package domain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public enum Operator {
    PLUS("+", (prev, next) -> prev + next),
    MINUS("-", (prev, next) -> prev - next),
    MULTIPLY("*", (prev, next) -> prev * next),
    DIVIDE("/", (prev, next) -> prev / next);

    private String symbol;
    private BiFunction<Double, Double, Double> operate;
    private static Map<String, Operator> operators = getOperators();

    Operator(String symbol, BiFunction<Double, Double, Double> operate) {
        this.symbol = symbol;
        this.operate = operate;
    }

    public static Operator from(String symbol) {
        if (!operators.containsKey(symbol)) {
            throw new OperatorException();
        }
        return operators.get(symbol);
    }

    private static Map<String, Operator> getOperators() {
        Map<String, Operator> operators = new HashMap<>();
        Arrays.stream(Operator.values()).forEach(operator -> operators.put(operator.symbol, operator));
        return operators;
    }

    public double calculate(double prev, double next) {
        return operate.apply(prev, next);
    }
}
