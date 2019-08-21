package pl.slemjet.interpreter.exercise;

import java.util.HashMap;
import java.util.Map;

class ExpressionProcessor {
    public Map<Character, Integer> variables = new HashMap<>();

    public int calculate(String expression) {
        int currentValue = 0;

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            switch (c) {
                case '+':
                    currentValue += getValue(expression.charAt(++i));
                    break;
                case '-':
                    currentValue -= getValue(expression.charAt(++i));
                    break;
                default:
                    currentValue = getValue(c);
            }
        }
        return currentValue;
    }

    private int getValue(char c) {
        if (Character.isDigit(c))
            return Integer.parseInt(c + "");
        else {
            if (variables.containsKey(c)) {
                return variables.get(c);
            }
        }
        return 0;
    }
}
