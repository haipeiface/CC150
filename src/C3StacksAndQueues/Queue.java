package C3StacksAndQueues;

public class Queue {
    Node first, last;

    public Queue() {
        this.first = null;
    }

    void offer(Object item) {
        if (this.first == null) {
            this.first.data = item;
            this.last = first;
        } else  {
            last.next.data = item;
            last = last.next;
        }
    }

    Object poll() {
        if (first != null) {
            Object item = first.data;
            first = first.next;
            return item;
        }
        return null;
    }

}
