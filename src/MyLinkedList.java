// MyLinkedList.java (finished)
public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {

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
        if (tail == null) {
            head = tail = newNode;
        } else {
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
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) current = current.next;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) current = current.prev;
        }
        return current;
    }

    @Override
    public void sort() {
        if (size < 2) return;
        Object[] array = toArray();
        java.util.Arrays.sort(array);
        clear();
        for (Object obj : array) add((T) obj);
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            result[i] = current.data;
            current = current.next;
        }
        return result;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public int indexOf(Object object) {
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.data.equals(object)) return i;
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        Node current = tail;
        for (int i = size - 1; i >= 0; i--) {
            if (current.data.equals(object)) return i;
            current = current.prev;
        }
        return -1;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private Node current = head;

            public boolean hasNext() {
                return current != null;
            }

            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    @Override public void set(int index, T item) {}
    @Override public void add(int index, T item) {}
    @Override public void addFirst(T item) {}
    @Override public void addLast(T item) {}
    @Override public T getFirst() { return null; }
    @Override public T getLast() { return null; }
    @Override public void removeFirst() {}
    @Override public void removeLast() {}
}
