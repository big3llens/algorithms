package lesson3.queue;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = initDeque();
        System.out.println(deque.peekTail());
        System.out.println(deque.peekFront());
        deque.showData();
        System.out.println("----------------------------------");
        deque.remove();
        deque.remove();
        deque.remove();
        System.out.println(deque.insertFront(13));
        System.out.println(deque.removeTail());
        System.out.println(deque.insert(20));
        System.out.println(deque.insert(100000));

        deque.showData();
    }

    public static Deque <Integer> initDeque(){
        Deque<Integer> deque = new DequeImpl<>(6);
        deque.insert(5);
        deque.insert(4);
        deque.insert(1);
        deque.insert(7);
        deque.insert(9);
        deque.insert(3);
        return deque;
    }
}
