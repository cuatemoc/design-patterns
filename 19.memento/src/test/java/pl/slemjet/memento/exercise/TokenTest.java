package pl.slemjet.memento.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TokenTest {
    @Test
    public void singleTokenTest() {
        TokenMachine tm = new TokenMachine();
        Memento m = tm.addToken(123);
        tm.addToken(456);
        tm.revert(m);

        assertEquals(1, tm.tokens.size());
        assertEquals(123, tm.tokens.get(0).value);
    }

    @Test
    public void twoTokenTest() {
        TokenMachine tm = new TokenMachine();
        tm.addToken(1);
        Memento m = tm.addToken(2);
        tm.addToken(3);
        tm.revert(m);
        assertEquals(2, tm.tokens.size());
        assertEquals(1, tm.tokens.get(0).value);
        assertEquals(2, tm.tokens.get(1).value);
    }

    @Test
    public void fiddledTokenTest() {
        TokenMachine tm = new TokenMachine();
        System.out.println("Made a token with value 111 and kept a reference");
        Token token = new Token(111);
        System.out.println("Added this token to the list");
        tm.addToken(token);
        Memento m = tm.addToken(222);
        System.out.println("Changed this token's value to 333 :)");
        token.value = 333;
        tm.revert(m);

        assertEquals(2, tm.tokens.size()
        );

        assertEquals(111, tm.tokens.get(0).value);
    }
}