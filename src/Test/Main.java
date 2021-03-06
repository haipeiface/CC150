package Test;

import C1ArraysAndStrings.Chapter1;
import C1ArraysAndStrings.StringHelper;
import C2LinkedLists.Chapter2;
import C2LinkedLists.LinkedListNode;
import C3StacksAndQueues.Chapter3;
import Proxy.Bird;
import Proxy.DynamicProxy.MyInvocationHandler;
import Proxy.Flyable;
import Proxy.HorseProxy.Eatable;
import Proxy.HorseProxy.Horse;
import Proxy.HorseProxy.HorseLogProxy;
import Proxy.HorseProxy.HorseTimeProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Stack;


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

        //3.6
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(4);
        Stack<Integer> r = Chapter3.sort(stack);
        System.out.println("-------3.6------");
        for (int i: r) {
            System.out.println(i);
        }
//        static proxy
//        Bird bird = new Bird();
//        BirdTimeProxy p2 = new BirdTimeProxy(bird);
//        BirdLogProxy p1 = new BirdLogProxy(p2);
//
//        p1.fly();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Bird bird = new Bird();
        Flyable flyable = (Flyable) myInvocationHandler.bind(bird);


        flyable.fly();

        new HorseTimeProxy(new HorseLogProxy(new Horse())).eat();

        Horse horse = new Horse();
        Eatable e = (Eatable) Proxy.newProxyInstance(Horse.class.getClassLoader(),
                new Class[]{Eatable.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("dynamic proxy begin...");
                        Object o = method.invoke(horse, args);
                        System.out.println("dynamic proxy end...");
                        return null;
                    }
                });
        e.eat();
    }

}
