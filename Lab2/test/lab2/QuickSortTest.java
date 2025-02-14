package lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {

    // Two tests for the good Quick Sort method

    @Test
    public void testGoodQuickSort_UnsortedArray() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Input (Faulty - Should Fail):");
        QuickSort.printArray(arr);
        int[] expected = {11, 12, 22, 25, 34, 64, 90};

        QuickSort.goodQuickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr);
        System.out.println("Output:");
        QuickSort.printArray(arr);
    }

    @Test
    public void testGoodQuickSort_SortedArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Input (Faulty - Should Fail):");
        QuickSort.printArray(arr);
        int[] expected = {1, 2, 3, 4, 5, 6, 7};

        QuickSort.goodQuickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr);
        System.out.println("Output:");
        QuickSort.printArray(arr);
    }

    // Two tests for the faulty Quick Sort method that should fail

    @Test
    public void testFaultyQuickSort_PivotIsSmallest() {
        int[] arr = {1, 9, 5, 3, 7};
        System.out.println("Input (Faulty - Should Pass):");
        QuickSort.printArray(arr);
        int[] expected = {1, 3, 5, 7, 9}; // Correctly sorted array

        QuickSort.faultyQuickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr); // This test will fail
        System.out.println("Output:");
        QuickSort.printArray(arr);
    }

    @Test
    public void testFaultyQuickSort_PivotIsLargest() {
        int[] arr = {3, 6, 2, 8, 5, 10};
        System.out.println("Input (Faulty - Should Fail):");
        QuickSort.printArray(arr);
        int[] expected = {2, 3, 5, 6, 8, 10}; // Correctly sorted array

        QuickSort.faultyQuickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr); // This test will fail
        System.out.println("Output:");
        QuickSort.printArray(arr);
    }

    // Two tests for the faulty Quick Sort method that should pass

    @Test
    public void testFaultyQuickSort_ArrayAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Input (Faulty - Should Pass):");
        QuickSort.printArray(arr);
        int[] expected = {1, 2, 3, 4, 5}; // Already sorted

        QuickSort.faultyQuickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr); // This test will pass
        System.out.println("Output:");
        QuickSort.printArray(arr);
    }

    @Test
    public void testFaultyQuickSort_PivotShouldMove() {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Input (Faulty - Should Fail):");
        QuickSort.printArray(arr);
        int[] expected = {1, 5, 7, 8, 9, 10}; // Correctly sorted array

        QuickSort.faultyQuickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr); // This test will pass
        System.out.println("Output:");
        QuickSort.printArray(arr);
    }

    // Two tests for the corrected Quick Sort method

    @Test
    public void testCorrectedQuickSort_PivotIsSmallest() {
        int[] arr = {1, 9, 5, 3, 7};
        System.out.println("Input (Faulty - Should Pass):");
        QuickSort.printArray(arr);
        int[] expected = {1, 3, 5, 7, 9}; // Correctly sorted array

        QuickSort.correctedQuickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr); // This test will pass
        System.out.println("Output:");
        QuickSort.printArray(arr);
    }

    @Test
    public void testCorrectedQuickSort_PivotIsLargest() {
        int[] arr = {3, 6, 2, 8, 5, 10};
        System.out.println("Input (Faulty - Should Fail):");
        QuickSort.printArray(arr);
        int[] expected = {2, 3, 5, 6, 8, 10}; // Correctly sorted array

        QuickSort.correctedQuickSort(arr, 0, arr.length - 1);

        assertArrayEquals(expected, arr); // This test will fail
        System.out.println("Output:");
        QuickSort.printArray(arr);
    }
}