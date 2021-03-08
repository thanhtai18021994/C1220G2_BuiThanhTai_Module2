package _review_oop.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Queue queue=new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("enter n");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            int a= (int) queue.poll();
            queue.add(a);
            queue.add(a);
        }
//        System.out.println(queue.poll());
        System.out.println(queue.toString());
        System.out.println("Phan tu dau tien cua chuoi la:" +queue.peek());
    }
}
