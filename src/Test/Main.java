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
        head.add2Tail(1);
        head.add2Tail(2);

        System.out.println(head);
        System.out.println(Chapter2.deleteDups(head));
    }

}
