package lesson4;

public class Deque<E> {
    BidirectionalLinkedListImpl<E> list = new BidirectionalLinkedListImpl<>();
    public void addFirst(E value){
        list.addFirst(value);
    }
    public void addLast(E value){
        list.addLast(value);
    }

    public E removeFirst(){
        return list.removeFirst();
    }
    public E removeLast(){
        return list.removeLast();
    }
    public void contains(E value){
        list.contains(value);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
