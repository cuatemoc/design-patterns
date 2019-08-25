package pl.slemjet.iterator.exercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Node<T> {
    public T value;
    public Node<T> left, right, parent;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;

        left.parent = right.parent = this;
    }

    public Iterator<Node<T>> inOrder() {
        return makeInOrderIterator(new LinkedList<>(), this);
    }

    public Iterator<Node<T>> preOrder() {
        return makePreOrderIterator(new LinkedList<>(), this);
    }

    /**
     * //        preorder(node)
     * //        if (node == null)
     * //            return
     * //                    visit(node)
     * //        preorder(node.left)
     * //        preorder(node.right)
     *
     * @param orderedNodes
     * @param nextNode
     * @return
     */
    private Iterator<Node<T>> makePreOrderIterator(List<Node<T>> orderedNodes, Node<T> nextNode) {
        if (nextNode != null) {
            orderedNodes.add(nextNode);
            if (nextNode.left != null)
                makePreOrderIterator(orderedNodes, nextNode.left);
            if (nextNode.right != null)
                makePreOrderIterator(orderedNodes, nextNode.right);
        }
        return orderedNodes.iterator();
    }

    /**
     //     inorder(node)
     //     if (node == null)
     //         return
     //     inorder(node.left)
     //     visit(node)
     //     inorder(node.right)
     *
     * @param orderedNodes
     * @param nextNode
     * @return
     */
    private Iterator<Node<T>> makeInOrderIterator(List<Node<T>> orderedNodes, Node<T> nextNode) {
        if (nextNode != null) {
            if (nextNode.left != null)
                makePreOrderIterator(orderedNodes, nextNode.left);
            orderedNodes.add(nextNode);
            if (nextNode.right != null)
                makePreOrderIterator(orderedNodes, nextNode.right);
        }
        return orderedNodes.iterator();
    }
}

