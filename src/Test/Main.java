package Test;

import C1ArraysAndStrings.Chapter1;
import C1ArraysAndStrings.StringHelper;
import C2LinkedLists.Chapter2;
import C2LinkedLists.LinkedListNode;

public class Main {

    public static void main(String args[]){
        String s = Chapter1.removeDuplicates(new char[]{'a','b','a','a'});
        System.out.println(s);

        System.out.println(StringHelper.String2ListCharacter("abcde"));


        System.out.println(Chapter1.anagram("abcde","adcbe"));

        //2.1
        LinkedListNode head = new LinkedListNode(1);
        head.add2Tail(2);
        head.add2Tail(3);
        head.add2Tail(4);
        head.add2Tail(5);


        //2.4
        LinkedListNode head2 = new LinkedListNode(1);
        head2.add2Tail(1);
        head2.add2Tail(1);

        System.out.println(head);
//2.1        System.out.println(Chapter2.deleteDups(head));
//2.3        System.out.println(Chapter2.nthToLast(head, 3));
        System.out.println(Chapter2.addList(head, head2));

        //2.5
        LinkedListNode circle = new LinkedListNode(1);
        LinkedListNode joinPoint = new LinkedListNode(2);
        circle.next = joinPoint;
        circle.next.next = new LinkedListNode(3);
        circle.next.next.next = new LinkedListNode(4);
        circle.next.next.next.next = new LinkedListNode(5);
        circle.next.next.next.next.next = new LinkedListNode(6);
        circle.next.next.next.next.next.next = joinPoint;
        System.out.println(Chapter2.findBeginning(circle).getData());

    }

}
