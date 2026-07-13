import java.util.*;

public class Main {

    static void minHeapify(int[] arr, int i, int n) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int smallest = i;

        if (left <= n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right <= n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            minHeapify(arr, smallest, n);
        }
    }

    static void buildMinHeap(int[] arr, int n) {
        for (int i = n / 2; i >= 1; i--) {
            minHeapify(arr, i, n);
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 10, 5, 20, 2, 15, 30, 40};
        int n = 7;

        buildMinHeap(arr, n);

        System.out.println("Min Heap:");
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}