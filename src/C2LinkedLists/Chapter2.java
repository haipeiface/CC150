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

                if (runner.data == current.data) {
                    LinkedListNode tmp = current.next;
                    previous.next = tmp;
                    current = tmp;
                    break;
                }
                runner = runner.next;   //移动指针总是在后几步
            }
            if (runner == current) {
                previous = current;
                current = current.next; //移动指针总是在后几步
            }
        }
        return head;
    }

    //2.2
    public static LinkedListNode nthToLast(LinkedListNode head, int n) {
        if (head == null || n < 1) {
            return head;
        }
        LinkedListNode fast = head;
        LinkedListNode slow = head;

        while (n > 0) {
            fast = fast.next;
            n--;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    //2.4
    public static LinkedListNode addList(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        int carry = 0;
        int result = 0;
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode current = dummy;
        while (l1 != null && l2 != null) {
            int tmp = l1.data + l2.data + carry;
            carry = tmp / 10;
            result = tmp % 10;
            current.next = new LinkedListNode(result);
            l1 = l1.next;
            l2 = l2.next;
            current = current.next;
        }
        while (l1 != null) {
            current.next = new LinkedListNode(l1.data + carry);
            l1 = l1.next;
            current = current.next;
        }
        while (l2 != null) {
            current.next = new LinkedListNode(l2.data + carry);
            l2 = l2.next;
            current = current.next;
        }
        if (l1 == null && l2 == null && carry != 0) current.next = new LinkedListNode(carry);
        return dummy.next;
    }

    //2.5
    public static LinkedListNode findBeginning(LinkedListNode head) {
        if(head == null) return head;

        LinkedListNode fast = head;
        LinkedListNode slow = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) break;
        }

        while (slow != head) {
            slow = slow.next;
            head = head.next;
        }

        return head;
    }
}
