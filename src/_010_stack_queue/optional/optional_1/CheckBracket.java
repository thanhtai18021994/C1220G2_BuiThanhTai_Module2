package _010_stack_queue.optional.optional_1;

import java.util.Stack;

public class CheckBracket {
    public static Boolean check(String str) {
        Stack<Character> Bstack = new Stack();
        char[] arr = new char[str.length()];
        arr = str.toCharArray();
        if(arr[0]=='('&&arr[arr.length-1]==')'){
            return false;
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == '(') {
                Bstack.push('(');
            } else if (arr[j] == ')') {
                if (Bstack.isEmpty()) {
                    return false;
                }
                char left = Bstack.pop();
                if (left != '(') {
                    return false;
                }
            }
        }
        if (Bstack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        System.out.println(check(str));
    }
}
