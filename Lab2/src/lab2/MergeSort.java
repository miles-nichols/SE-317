package lab2;

public class MergeSort {

    // Correct MergeSort method
    public static void goodMergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        goodMergeSort(left);
        goodMergeSort(right);

        merge(arr, left, right);
    }

    // Faulty MergeSort method
    public static void faultyMergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        // Fault: Forget to merge left and right back correctly
        faultyMergeSort(left);
        faultyMergeSort(right);

        // Fault: Merge logic is skipped (incorrectly done)
        // merge(arr, left, right); <-- Missing!
    }

    // Corrected MergeSort method
    public static void correctedMergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        correctedMergeSort(left);
        correctedMergeSort(right);

        // Correct merge logic
        merge(arr, left, right);
    }

    // Helper method to merge two subarrays
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // Helper method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
