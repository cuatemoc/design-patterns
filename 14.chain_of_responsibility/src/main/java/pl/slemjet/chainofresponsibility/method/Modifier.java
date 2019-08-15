package pl.slemjet.chainofresponsibility.method;

public interface Modifier {

    void add(Modifier modifier);

    void handle();
}
