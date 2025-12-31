package ThucHanh;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack <T> {
    private LinkedList <T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public T pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        else return false;
    }

    static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");

        System.out.println("1.1 Size of stack after push operation: " + stack.size());
        System.out.println("1.2. Pop elements from stack: ");

        while (!stack.isEmpty()) {
            System.out.println(" %s, " + stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operation: " + stack.size());
    }

    static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("2.1. Size of stack after push operation: " + stack.size());
        System.out.println("2.2. Pop elements from stack: ");

        while (!stack.isEmpty()) {
            System.out.println("%d, " + stack.pop());
        }
        System.out.println("\n3.3. Size of stack after pop operation: " + stack.size());
    }
}
