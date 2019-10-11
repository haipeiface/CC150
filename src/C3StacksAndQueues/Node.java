package C3StacksAndQueues;

public class Node<T>{
    Node<T> next;

    T data;

    public T getData() {
        return data;
    }

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    Node() {
        this.data = null;
        this.next = null;
    }

}
