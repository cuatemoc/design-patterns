package pl.slemjet.interpreter.parsing;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pl.slemjet.interpreter.lexing.Token;
import pl.slemjet.interpreter.lexing.TokenType;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
public class BinaryOperation implements Element {

    private BinaryOperationType type;
    private Element left, right;

    @Override
    public int eval() {

        switch (type) {
            case ADDITION:
                return left.eval() + right.eval();
            case SUBTRACTION:
                return left.eval() - right.eval();
            default:
                return 0;
        }
    }

    public static Element parse(List<Token> tokens) {
        BinaryOperation result = new BinaryOperation();
        boolean hasLeftHandSide = false;

        for (int i = 0; i < tokens.size(); i++) {
            Token token = tokens.get(i);

            switch (token.tokenType) {
                case PLUS:
                    result.type = BinaryOperationType.ADDITION;
                    break;
                case MINUS:
                    result.type = BinaryOperationType.SUBTRACTION;
                    break;
                case VALUE:
                    IntegerElement integerElement = new IntegerElement(Integer.parseInt(token.value));
                    if (!hasLeftHandSide) {
                        result.left = integerElement;
                        hasLeftHandSide = true;
                    } else {
                        result.right = integerElement;
                    }
                    break;
                case LPAR:
                    int j = i; // RPAR location
                    for (; j < tokens.size(); j++) {
                        if (TokenType.RPAR.equals(tokens.get(j).tokenType)) {
                            break;
                        }
                    }

                    List<Token> subExpressions = tokens.stream()
                            .skip(i + 1)
                            .limit(j - i - 1)
                            .collect(Collectors.toList());

                    Element element = parse(subExpressions);

                    if (!hasLeftHandSide) {
                        result.left = element;
                        hasLeftHandSide = true;
                    } else
                        result.right = element;

                    i = j; // subexpression processed -> continue
                    break;
//                case RPAR:
//                    break;
            }
        }

        return result;
    }
}
