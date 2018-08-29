package visitors.intrusive;


public abstract class Expression {

    /**
     * BAD!
     * Violates open/closed principle
     * Violates single responsibility principle
     */
    public abstract void print(StringBuilder sb);
}
