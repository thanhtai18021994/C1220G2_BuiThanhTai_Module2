package _010_stack_queue.optional.optional_2;

import java.util.ArrayList;
import java.util.Stack;

public class Binary {
    public static String convertBinary(int num) {
        Boolean check = true;
        Stack<Integer> stack=new Stack();

        while (check) {
            if(num%2!=0){
                stack.push(1);
            }else {
                stack.push(0);
            }
            num = (int) Math.floor((num/2));
           check=num==0?false:true;
        }
        ArrayList<Integer> arr=new ArrayList();
        while (!stack.isEmpty()){
            int i=0;
            arr.add(stack.pop());
            i++;
        }
        String s=String.valueOf(arr);
        return s;
    }

    public static void main(String[] args) {
        int num2=71;
        String str=convertBinary(num2);
        System.out.println(str);
    }
}
