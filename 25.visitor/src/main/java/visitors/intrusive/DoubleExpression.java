package visitors.intrusive;

public class DoubleExpression extends Expression {
    private Double value;

    public DoubleExpression(Double value) {
        this.value = value;
    }

    public void print(StringBuilder sb) {
        sb.append(value);
    }
}
