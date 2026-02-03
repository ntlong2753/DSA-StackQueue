package DSAQueue;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String str;
        str = sc.nextLine();
        String[] words = str.split(" ");
        Stack<String> stack = new Stack<>();
        for (String word : words) {
            stack.push(word);
        }
        System.out.println(stack.peek());
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
