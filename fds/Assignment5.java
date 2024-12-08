public class Assignment5 {
    
    public static void heapify(int[] arr, int i, int size) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int maxIdx = i;

        // Check if left child exists and is greater than the current max
        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        // Check if right child exists and is greater than the current max
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }
        // If maxIdx has changed, swap and continue heapifying
        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(arr, maxIdx, size);
        }
    }

    public static void buildMaxHeap(int[] arr) {
        int n = arr.length;
        // Start heapifying from the last non-leaf node down to the root
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        buildMaxHeap(arr);
        System.out.println("\nMax Heap: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
