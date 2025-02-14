package lab2;

public class QuickSort {

    // Correct implementation of Quick Sort
    public static void goodQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Partition the array correctly
            goodQuickSort(arr, low, pivotIndex - 1); // Sort the left subarray
            goodQuickSort(arr, pivotIndex + 1, high); // Sort the right subarray
        }
    }

    // Faulty implementation of Quick Sort (incorrect partition usage)
    public static void faultyQuickSort(int[] arr, int low, int high) {
    	if (low < high) {
    		// Fault:  goodQuickSort(arr, high, pivotIndex - 1); should use low instead of high
            int pivotIndex = partition(arr, low, high); // Partition the array correctly
            goodQuickSort(arr, high, pivotIndex - 1); // Sort the left subarray
            goodQuickSort(arr, pivotIndex + 1, high); // Sort the right subarray
        }
    }

    // Corrected implementation of Quick Sort
    public static void correctedQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Partition the array
            correctedQuickSort(arr, low, pivotIndex - 1); // Fix: Corrected right boundary for left subarray
            correctedQuickSort(arr, pivotIndex + 1, high); // Fix: Corrected left boundary for right subarray
        }
    }

    // Helper method to partition the array
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the pivot index
    }

    // Method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
