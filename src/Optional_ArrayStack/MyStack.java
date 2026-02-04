package Optional_ArrayStack;

public class MyStack {
    public int[] arr;
    public int size;
    public int index = 0;

    public MyStack(int size) {
        this.arr = new int[size];
        this.size = size;
    }

    public void push(int element) {
        if(isFull()) {
            throw new StackOverflowError("Stack is full!");
        }
        arr[index] = element;
        index++;
    }
    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is null");
        }
        index--;
        return arr[index];
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        if(index == 0) {
            return true;
        }
        return false;
    }
    public boolean isFull() {
        if(index == size) {
            return true;
        }
        return false;
    }
}
