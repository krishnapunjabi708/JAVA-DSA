import java.util.Scanner;

public class HeapSort {
    // Method to heapify a subtree rooted at index `i`
    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        // Find the largest among root, left child, and right child
        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        // Swap and continue heapifying if root is not the largest
        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    // Method to create a max heap
    public static void create(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    // Heap Sort method
    public static void heapSort(int arr[]) {
        int n = arr.length;
        create(arr); // Ensure the array is in heap order before sorting
        for (int i = n - 1; i > 0; i--) {
            // Move the current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, 0, i);
        }
    }

    // Method to print the array and min/max elements
    public static void print(int arr[]) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Max element: " + arr[arr.length - 1]);
        System.out.println("Min element: " + arr[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Operations: 1. Create Heap 2. Heap Sort 3. Print 4. Exit");
        int choice;

        do {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    create(arr);
                    System.out.println("Heap created.");
                    break;
                case 2:
                    heapSort(arr);
                    System.out.println("Array sorted.");
                    break;
                case 3:
                    print(arr);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter a valid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
