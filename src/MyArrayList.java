/**
 * MyArrayList is a custom implementation of a dynamic array.
 */
public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
    private Object[] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyArrayList() {
        data = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    // Doubles array capacity when full
    private void ensureCapacity() {
        if (size >= data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    // Adds an item to the end
    public void add(T item) {
        ensureCapacity();
        data[size++] = item;
    }

    // Returns element at index
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    // Removes element by index
    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[--size] = null;
    }

    // Returns current number of elements
    public int size() {
        return size;
    }

    // Sorts elements using bubble sort
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                T a = (T) data[j];
                T b = (T) data[j + 1];
                if (a.compareTo(b) > 0) {
                    data[j] = b;
                    data[j + 1] = a;
                }
            }
        }
    }

    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(object)) return i;
        }
        return -1;
    }

    public int lastIndexOf(Object object) {
        for (int i = size - 1; i >= 0; i--) {
            if (data[i].equals(object)) return i;
        }
        return -1;
    }

    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);
        return result;
    }

    public void clear() {
        for (int i = 0; i < size; i++) data[i] = null;
        size = 0;
    }

    public void set(int index, T item) {}
    public void add(int index, T item) {}
    public void addFirst(T item) {}
    public void addLast(T item) {}
    public T getFirst() { return null; }
    public T getLast() { return null; }
    public void removeFirst() {}
    public void removeLast() {}

    // Allows for-each loop
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private int current = 0;
            public boolean hasNext() { return current < size; }
            public T next() { return (T) data[current++]; }
        };
    }

    // Checks index is valid
    private void checkIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
    }
}
