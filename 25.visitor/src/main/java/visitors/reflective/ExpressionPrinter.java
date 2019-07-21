package visitors.reflective;

public class ExpressionPrinter {
    /**
     * Ugly casting, worse performance, no check if missing for certain expression
     * @param expr
     * @param sb
     */
    public static void print(Expression expr, StringBuilder sb){
        if (expr instanceof DoubleExpression){
            DoubleExpression doubleExpression = (DoubleExpression) expr;
            sb.append(doubleExpression.getValue());
        }else if (expr instanceof AdditionExpression){
            AdditionExpression additionExpression = (AdditionExpression) expr;
            sb.append("(");
            print(additionExpression.getLeft(), sb);
            sb.append("+");
            print(additionExpression.getRight(), sb);
            sb.append(")");
        }
    }
}
