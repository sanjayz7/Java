public class Main {

    public static void main(String[] args) {

        int[] array = {5, 3, 8, 4, 2, 7, 1, 6};

        System.out.println("Before Sorting:");
        printArray(array);

        mergeSort(array);

        System.out.println("\nAfter Sorting:");
        printArray(array);
    }

    // Merge Sort function
    private static void mergeSort(int[] array) {

        int length = array.length;

        // Base case
        if (length <= 1)
            return;

        int middle = length / 2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // left array index
        int j = 0; // right array index

        // Split array
        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }

        // Recursive calls
        mergeSort(leftArray);
        mergeSort(rightArray);

        // Merge
        merge(array, leftArray, rightArray);
    }

    // Merge function
    private static void merge(int[] array, int[] leftArray, int[] rightArray) {

        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, j = 0, k = 0;

        // Compare and merge
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
                  k++;
            } else {
                array[k] = rightArray[j];
                j++;
                  k++;
            }
          
        }

        // Copy remaining elements
        while (i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Print array
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
