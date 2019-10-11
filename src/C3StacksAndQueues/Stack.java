package C3StacksAndQueues;

public class Stack<T> {
    private Node<T> top;

    public T pop() {
        if (top != null) {
            Object item = top.data;
            top = top.next;
            return (T) item;
        }
        return null;
    }

    void push(Object item) {
        Node t = new Node(item);
        t.next = top;
        top = t;
    }
}
