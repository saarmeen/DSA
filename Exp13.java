public class Exp13 {
    private int capacity;
    private int[] deque;
    private int front, rear, size;

    public Exp13(int capacity) {
        this.capacity = capacity;
        this.deque = new int[capacity];
        this.front = -1;
        this.rear = 0;
        this.size = 0;
    }

    public void enqueueFront(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot enqueue at front.");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                front = (front - 1 + capacity) % capacity;
            }
            deque[front] = item;
            size++;
            System.out.println("Enqueued " + item + " at front of the deque.");
        }
    }

    public void enqueueRear(int item) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot enqueue at rear.");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % capacity;
            }
            deque[rear] = item;
            size++;
            System.out.println("Enqueued " + item + " at rear of the deque.");
        }
    }

    public int dequeueFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot dequeue from front.");
            return -1;
        } else {
            int removedItem = deque[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            size--;
            System.out.println("Dequeued " + removedItem + " from front of the deque.");
            return removedItem;
        }
    }

    public int dequeueRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot dequeue from rear.");
            return -1;
        } else {
            int removedItem = deque[rear];
            if (front == rear) {
                front = rear = -1;
            } else {
                rear = (rear - 1 + capacity) % capacity;
            }
            size--;
            System.out.println("Dequeued " + removedItem + " from rear of the deque.");
            return removedItem;
        }
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot peek at front.");
            return -1;
        } else {
            return deque[front];
        }
    }

    public int peekRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot peek at rear.");
            return -1;
        } else {
            return deque[rear];
        }
    }

    public static void main(String[] args) {
        Exp13 deque = new Exp13(5);
        deque.enqueueRear(1);
        deque.enqueueRear(2);
        deque.enqueueFront(3);
        deque.enqueueFront(4);
        deque.dequeueFront();
        deque.dequeueRear();
        System.out.println("Front of the deque: " + deque.peekFront());
        System.out.println("Rear of the deque: " + deque.peekRear());
    }
}
