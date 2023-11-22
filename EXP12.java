public class EXP12 {
    private int front, rear, size;
    private int capacity;
    private int[] array;

    public EXP12(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity - 1;
        this.array = new int[capacity];
    }


    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }

        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
        System.out.println(item + " enqueued to the queue");
    }


    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return Integer.MIN_VALUE;
        }

        int item = array[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }


    public boolean isFull() {
        return size == capacity;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        EXP12 queue = new EXP12(5);


        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);


        queue.enqueue(6);


        System.out.println(queue.dequeue() + " dequeued from the queue");
        System.out.println(queue.dequeue() + " dequeued from the queue");


        queue.enqueue(6);
        queue.enqueue(7);


        System.out.println("Elements in the queue:");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
