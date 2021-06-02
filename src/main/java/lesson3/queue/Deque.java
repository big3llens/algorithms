package lesson3.queue;

public interface Deque<E> extends Queue<E> {

    public E peekTail();

    public E removeTail();

    boolean insertFront(E value);

    public void showData();
}
