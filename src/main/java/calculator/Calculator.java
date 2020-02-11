package calculator;

import domain.Expression;

public class Calculator {
    public Double run(String userExpression) {
        Expression expression = new Expression(userExpression);
        return expression.getResult();
    }
}
