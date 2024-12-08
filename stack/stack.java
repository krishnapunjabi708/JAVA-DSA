import java.util.*;

public class stack{
    private int top;
    private int arr[];
    private int size;

    public stack(int size) {
        top = -1;
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return false;
        } else {
            top++;
            arr[top] = value;
            System.out.println(value + " pushed into stack");
            return true;
        }
    }

    public boolean pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return false;
        } else {
            int value = arr[top];
            top--;
            System.out.println(value + " popped from stack");
            return true;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        int size = scanner.nextInt();
        stack stack = new stack(size);
        int choice;
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter value to be pushed:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("Top element: " + stack.peek());
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        scanner.close();
    }
}
