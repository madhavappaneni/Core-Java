package GenericsDemo;

// public class GenericList<T> { if want to allow list to only work with Number
// class GenericListNum<T extends Comparable> {

class GenericListNum<T extends Number & Cloneable> {

}

public class GenericList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = (item);
    }

    public T get(int index) {
        return items[index];
    }
}
