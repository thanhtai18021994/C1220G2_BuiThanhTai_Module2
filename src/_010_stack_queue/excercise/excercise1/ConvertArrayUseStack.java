package _010_stack_queue.excercise.excercise1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class ConvertArrayUseStack {
    public static int[] convert(int[] arr){
        Stack<Integer> stack=new Stack();
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }

        int[] myarr=new int[arr.length];
        int j = 0;
        while (!stack.empty()){
            myarr[j]=stack.pop();
            j++;
        }
        return myarr;
    }

    public static void main(String[] args) {
        int[] arr={3,4,5};
        int[] myarr=convert(arr);
        System.out.println(Arrays.toString(myarr));;
    }
}

