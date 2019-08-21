package pl.slemjet.interpreter.parsing;

public class IntegerElement implements Element {

    private int value;

    public IntegerElement(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        return value;
    }
}
