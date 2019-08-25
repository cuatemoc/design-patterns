package pl.slemjet.iterator.exercise;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test
    void preOrderTest() {
        Node<Character> node = new Node<>('a',
                new Node<>('b',
                        new Node<>('c'),
                        new Node<>('d')),
                new Node<>('e'));
        StringBuilder sb = new StringBuilder();
        Iterator<Node<Character>> it = node.preOrder();
        while (it.hasNext())
        {
            Node<Character> next = it.next();
            sb.append(next.value);
        }
        assertEquals("abcde", sb.toString());
    }


    @Test
    void inOrderTest1() {
        Node<Character> node = new Node<>('a',
                new Node<>('b',
                        new Node<>('c'),
                        new Node<>('d')),
                new Node<>('e'));
        StringBuilder sb = new StringBuilder();
        Iterator<Node<Character>> it = node.inOrder();
        while (it.hasNext())
        {
            Node<Character> next = it.next();
            sb.append(next.value);
        }
        assertEquals("bcdae", sb.toString());
    }

    @Test
    void inOrderTest2() {

        Node<Integer> node = new Node<>(1,
                new Node<>(2),
                new Node<>(3));

        StringBuilder sb = new StringBuilder();
        Iterator<Node<Integer>> it = node.inOrder();
        while (it.hasNext())
        {
            Node<Integer> next = it.next();
            sb.append(next.value);
        }
        assertEquals("213", sb.toString());
    }
}