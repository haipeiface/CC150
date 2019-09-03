package C2LinkedLists;

public class Chapter2 {

    //2.1
    public static LinkedListNode deleteDups(LinkedListNode head) {
        if (head == null) return head;

        LinkedListNode previous = head;
        LinkedListNode current = previous.next;

        while(current != null) {
            LinkedListNode runner = head;
            while (runner != current) {
                runner = runner.next;
                if (runner.data == current.data) {
                    LinkedListNode tmp = current.next;
                    previous.next = tmp;
                    current = tmp;
                    break;
                }
                runner = runner.next;
            }
            if (runner == current) {
                previous = current;
                current = current.next;
            }
        }
        return head;
    }

}
