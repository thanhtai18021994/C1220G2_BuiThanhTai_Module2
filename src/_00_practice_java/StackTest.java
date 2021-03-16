package _00_practice_java;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.add(3);
        stack.add(6);
        stack.add(4);
        for (int i = 0; i <stack.size(); i++) {
            System.out.println(stack.peek());
        }
    }
}
