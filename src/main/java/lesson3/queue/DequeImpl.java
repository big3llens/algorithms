package lesson3.queue;

import java.util.Arrays;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E>{
    public DequeImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public E peekTail() {
        return data[tail];
    }

    @Override
    public boolean insertFront(E value) {
        if (isFull()) return false;

        if (head == HEAD_DEFAULT) head = data.length;

        data[--head] = value;
        size++;

        return true;
    }

    @Override
    public E removeTail() {
        if (isEmpty()) return null;

        if (tail == TAIL_DEFAULT) tail = data.length - 1;

        E value = data[tail--];

        size--;

        return value;
    }

    public void showData(){
        System.out.print(Arrays.toString(data));
        System.out.println(" size = " + size);
    }
}
