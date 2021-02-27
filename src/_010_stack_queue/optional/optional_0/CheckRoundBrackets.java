package _010_stack_queue.optional.optional_0;

import java.util.Stack;

public class CheckRoundBrackets {
    public static Boolean checkBrackets(String exp){
        Stack<Character> stack = new Stack();
        for (char c: exp.toCharArray()) {
            if (c != ')') {
                stack.push(c);
            }
            else {
                if (stack.peek() == '(') {
                    return true;
                }
                while (stack.peek() != '(') {
                    stack.pop();
                }
                stack.pop();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String exp="((x+y)";
        System.out.println(checkBrackets(exp));
//        if (CheckRoundBrackets.checkBrackets(exp)) {
//            System.out.println("The expression have duplicate parenthesis.");
//        } else {
//            System.out.println("The expression does not have duplicate parenthesis");
//        }
    }
}
