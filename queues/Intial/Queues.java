import java.util.Scanner;

public class Queues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The capacity of queue will be: ");
        int capacity=scanner.nextInt();
        Queue queue = new Queue(capacity);  // Create a Queue object

        while (true) {
            System.out.println("\n1. Enqueue (Add)");
            System.out.println("2. Dequeue (Remove)");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to enqueue: ");
                    int data = scanner.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    scanner.close();
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }

        }
        
    }
}

class Queue {
    private int[] items;
    private int front, rear, capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        items = new int[capacity];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue overflow!");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear++;
        items[rear] = data;
        System.out.println(data + " added to queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow!");
            return -1;
        }
        int data = items[front];
        if (front == rear) {
            front = rear = -1;  // Reset queue if only one element
        } else {
            front++;
        }
        System.out.println(data + " removed from queue");
      
        return data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }
}
