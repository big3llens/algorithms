package lesson4;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        checkLinkedList();
        checkDeque();
    }

    public static void checkLinkedList(){
        LinkedList<Integer> linkedList = new LinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.display();
        linkedList.removeFirst();
        linkedList.display();
        Iterator iterator = linkedList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        for (Integer i: linkedList) {
            System.out.println(i);
        }
    }

    public static void checkDeque(){
        Deque<Integer> deque = new Deque<>();
        deque.addFirst(1);
        deque.addFirst(22);
        deque.addFirst(333);
        deque.addLast(4444);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.removeLast());
        deque.addLast(5);
        System.out.println(deque);
    }
}
