package lesson4;

import java.util.NoSuchElementException;

public class BidirectionalLinkedListImpl<E> implements BidirectionalLinkedList<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;

    @Override
    public void addFirst(E value) {
        Node<E> f = first;
        Node<E> newNode = new Node<>(null, f, value);
        first = newNode;
        if(f == null) last = newNode;
        else f.prev = newNode;
        size++;

    }

    @Override
    public void addLast(E value) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(l, null, value);
        last = newNode;
        if (l == null) first = newNode;
        else l.next = newNode;
    }

    @Override
    public void add(E value) {

    }

    @Override
    public E removeFirst() {
        Node<E> f = first;
        if (f == null) throw new NoSuchElementException();
        Node<E> next = f.next;
        E value = f.value;
        first = next;
        f.next = null;
        f.value = null;
        if (next == null) last = null;
        else next.prev = null;
        size--;
        return value;
    }

    @Override
    public E removeLast() {
        Node<E> l = last;
        if (l == null) throw new NoSuchElementException();
        E value = l.value;
        Node<E> prev = l.prev;
        last = prev;
        l.value = null;
        l.prev = null;
        if (prev == null) first = null;
        size--;
        return value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = first;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public void contains(E value) {

    }

    private class Node<E>{
        private Node<E> prev;
        private Node<E> next;
        private E value;

        public Node(Node<E> prev, Node<E> next, E value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }
}
