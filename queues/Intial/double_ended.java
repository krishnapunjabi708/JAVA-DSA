public class double_ended {
    private int[] deque;
    private int front;
    private int rear;
    private int capacity;

    public double_ended(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        front = -1;
        rear = 0;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }

    public void insertFront(int data) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front = front - 1;
        }

        deque[front] = data;
    }

    public void insertRear(int data) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear = rear + 1;
        }

        deque[rear] = data;
    }

    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }

        int item = deque[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front = front + 1;
        }
        return item;
    }

    public int deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }

        int item = deque[rear];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear = rear - 1;
        }
        return item;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }

        return deque[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }

        return deque[rear];
    }

    public static void main(String[] args) {
        double_ended deque = new double_ended(5);

        deque.insertFront(1);
        deque.insertFront(2);
        deque.insertRear(3);
        deque.insertRear(4);

        System.out.println("Front element: " + deque.getFront());
        System.out.println("Rear element: " + deque.getRear());

        deque.deleteFront();
        deque.deleteRear();

        System.out.println("Front element after deletion: " + deque.getFront());
        System.out.println("Rear element after deletion: " + deque.getRear());
    }
}
