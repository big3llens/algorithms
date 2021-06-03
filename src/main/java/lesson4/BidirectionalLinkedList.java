package lesson4;

public interface BidirectionalLinkedList<E> {
    void add(E value);
    void addFirst(E value);
    void addLast(E value);
    E removeFirst();
    E removeLast();
    void contains(E value);
}
