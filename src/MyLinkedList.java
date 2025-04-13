// MyLinkedList.java (base structure)
public class MyLinkedList<T> implements MyList<T> {
    private class Node {
        T data;
        Node next;
        Node prev;
        Node(T data) { this.data = data; }
    }

    private Node head;
    private Node tail;
    private int size;

    public void add(T item) {
        Node newNode = new Node(item);
        if (tail == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public T get(int index) {
        return getNode(index).data;
    }

    public void remove(int index) {
        Node node = getNode(index);
        if (node.prev != null) node.prev.next = node.next;
        else head = node.next;
        if (node.next != null) node.next.prev = node.prev;
        else tail = node.prev;
        size--;
    }

    public int size() {
        return size;
    }

    private Node getNode(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current;
    }

    public void set(int index, T item) {}
    public void add(int index, T item) {}
    public void addFirst(T item) {}
    public void addLast(T item) {}
    public T getFirst() { return null; }
    public T getLast() { return null; }
    public void removeFirst() {}
    public void removeLast() {}
    public void sort() {}
    public int indexOf(Object object) { return -1; }
    public int lastIndexOf(Object object) { return -1; }
    public boolean exists(Object object) { return false; }
    public Object[] toArray() { return null; }
    public void clear() {}
    public java.util.Iterator<T> iterator() { return null; }
}