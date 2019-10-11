package C3StacksAndQueues;

import java.util.Stack;

public class Chapter3 {
    //3.6
    public static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> r = new Stack<>();
        while (!s.isEmpty()) {
            int tmp = s.pop();
            //一个放回老栈 一个放入新栈
            while (!r.isEmpty() && r.peek() > tmp) {//两个栈顶比较
                s.push(r.pop());
            }
            r.push(tmp);
        }
        return r;
    }

}
