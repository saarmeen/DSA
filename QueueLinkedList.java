class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueLinkedList {
    private Node front, rear;

    public QueueLinkedList() {
        this.front = this.rear = null;
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
            System.out.println("Enqueued " + item + " to the queue.");
        } else {
            rear.next = newNode;
            rear = newNode;
            System.out.println("Enqueued " + item + " to the queue.");
        }
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            int removedItem = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            System.out.println("Dequeued " + removedItem + " from the queue.");
            return removedItem;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.enqueue(1);
        queueLinkedList.enqueue(2);
        queueLinkedList.enqueue(3);
        queueLinkedList.dequeue();
        queueLinkedList.enqueue(4);
        queueLinkedList.enqueue(5);
        queueLinkedList.dequeue();
        queueLinkedList.dequeue();
        queueLinkedList.dequeue(); // This will print "Queue is empty. Cannot dequeue."
    }
}
