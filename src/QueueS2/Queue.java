package QueueS2;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if(this.front == null) {
            this.front = this.rear = newNode;
            rear.link = front;
        } else {
            newNode.link = front;
            rear.link = newNode;
            rear = newNode;
        }
    }

    public void deQueue() {
        if(front == null) {
            System.out.println("Queue is empty");
        }
        else if(front == rear) {
            System.out.println("Removed: " + front.data);
            front = rear = null;
        } else {
            System.out.println("Removed: " + front.data);
            this.front = front.link;
            rear.link = front;
        }
    }
    public void peekQueue() {
        if(front == null) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Front element is: " + front.data);
            System.out.println("Rear element is: " + rear.data);
        }
    }
    public void display() {
        if(front == null) {
            System.out.println("Queue is empty");
        }
        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != front);
        System.out.println();
    }
}
