package visitors.reflective;

public class DoubleExpression extends Expression {
    private Double value;

    public Double getValue() {
        return value;
    }

    public DoubleExpression(Double value) {
        this.value = value;
    }

}
