package DSA;

import java.util.Scanner;
import java.util.Stack;

public class ReverseIntArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai mang: ");
        int[] arr;
        arr = new int[sc.nextInt()];
        while(arr.length < 1) {
            System.out.print("Mang khong hop le, vui long nhap lai: ");
            arr = new int[sc.nextInt()];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("phan tu " + i + " = ");
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
