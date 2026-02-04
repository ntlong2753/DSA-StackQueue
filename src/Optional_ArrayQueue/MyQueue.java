package Optional_ArrayQueue;

public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head = 0;
    public int tail = -1;
    public int currentSize = 0;

    public MyQueue() {
    }

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if(currentSize == capacity) {
            return true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if(currentSize == 0) {
            return true;
        }
        return status;
    }

    public void enqueue(int item) {
       if(isQueueFull()) {
           System.out.println("Queue is full! Unable to add element: " + item);
       } else {
           tail = (tail + 1) % capacity;
           queueArr[tail] = item;
           currentSize++;
           System.out.println("Element " + item + " is pushed to Queue !");
       }
    }

    public void dequeue() {
        if(isQueueEmpty()) {
            System.out.println("Queue is empty! Unable to remove element.");
        } else {
            head++;
            if (head == capacity -1) {
                System.out.println("Removed element: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Removed element: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
