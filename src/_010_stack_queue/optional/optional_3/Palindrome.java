package _010_stack_queue.optional.optional_3;

import java.util.*;

public class Palindrome {
    public static Boolean checkPalindrome(String str){
        Queue<Character> queue=new ArrayDeque();
        Stack<Character> stack=new Stack();
        String str1=str.toLowerCase();
        char[] arr=str1.toCharArray();
        Boolean check=false;
        for (int i=0; i<arr.length;i++){
            queue.add(arr[i]);
            stack.add(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        for (int i=0;i<str.length();i++){
            if(stack.pop()==queue.poll()){
                check=true;
            }else {
                check=false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        String str="Able was I ere I saw elba";
        System.out.println(checkPalindrome(str));
    }
}
