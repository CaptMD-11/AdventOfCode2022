import java.util.ArrayList;

public class Stack<T> {

    private int size;
    private ArrayList<T> list;

    public Stack() {
        size = 0;
        list = new ArrayList<T>();
    }

    public void push(T el) {
        list.add(el);
        size++;
    }

    public T pop() {
        T res = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        size--;
        return res;
    }

    public int getSize() {
        return size;
    }

    public boolean empty() {
        if (size > 0)
            return true;
        return false;
    }

    public T peek() {
        return list.get(list.size() - 1);
    }

}