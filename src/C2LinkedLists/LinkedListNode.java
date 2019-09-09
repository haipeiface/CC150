package C2LinkedLists;

public class LinkedListNode {

    public LinkedListNode next = null;

    int data;

    public LinkedListNode(int data) {
        this.data = data;
    }

    public void add2Tail(int n) {
        LinkedListNode node = new LinkedListNode(n);
        LinkedListNode current = this;
        while (current.next != null) current = current.next;
        current.next = node;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        LinkedListNode n = this;
        StringBuilder result = new StringBuilder();
        while (n != null) {
            result.append(n.data);
            n = n.next;
        }
        return result.toString();
    }
}
