package _12_search_alrogithm.excercise;

import java.util.Scanner;
import java.util.Stack;

public class Excercise1 {
    public static void main(String[] args) {
        StringBuilder metring = new StringBuilder();
        System.out.println("Enter String");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        metring.append(str.charAt(0));
        Stack<Character> stack = new Stack<>();
        stack.push(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if ((int) str.charAt(i) > (int) stack.peek()) {
                stack.push(str.charAt(i));
              metring.append(str.charAt(i));
            }
        }
        System.out.println(metring.toString());
    }
}
