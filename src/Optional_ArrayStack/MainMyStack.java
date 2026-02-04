package Optional_ArrayStack;

import java.util.Scanner;

public class MainMyStack {
    public static void main(String[] as) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        MyStack stack = new MyStack(n);
        int element;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            element = sc.nextInt();
            stack.push(element);
        }
        /* ...
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        ... */

        System.out.println("1. Kích thước của stack sau khi thực hiện các thao tác push: " + stack.size());
        System.out.printf("2. Lấy các phần tử ra khỏi stack : ");

        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }

        System.out.println("\n3. Kích thước của stack sau khi thực hiện các thao tác pop : " + stack.size());
    }
}
