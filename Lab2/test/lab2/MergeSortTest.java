package lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {

    // 2 Tests for goodMergeSort (Correct Method)
    @Test
    public void testGoodMergeSort_AlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Input (Good):");
        MergeSort.printArray(arr);

        int[] expected = {1, 2, 3, 4, 5};
        MergeSort.goodMergeSort(arr);

        assertArrayEquals(expected, arr);
        System.out.println("Output:");
        MergeSort.printArray(arr);
    }

    @Test
    public void testGoodMergeSort_Unsorted() {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Input (Good):");
        MergeSort.printArray(arr);

        int[] expected = {1, 5, 7, 8, 9, 10};
        MergeSort.goodMergeSort(arr);

        assertArrayEquals(expected, arr);
        System.out.println("Output:");
        MergeSort.printArray(arr);
    }

    // 2 Tests for faultyMergeSort (Revealing the Fault)
    @Test
    public void testFaultyMergeSort_SmallArray() {
        int[] arr = {1};
        System.out.println("Input (Faulty - Should Fail):");
        MergeSort.printArray(arr);

        int[] expected = {};
        MergeSort.faultyMergeSort(arr);

        assertArrayEquals(expected, arr);         
        System.out.println("Output:");
        MergeSort.printArray(arr);
    }


    @Test
    public void testFaultyMergeSort_MissingMerge() {
        int[] arr = {10, 5, 7, 8};
        System.out.println("Input (Faulty - Should Fail):");
        MergeSort.printArray(arr);

        int[] expected = {5, 7, 8, 10};
        MergeSort.faultyMergeSort(arr);

        // This test will fail because the merge step is missing.
        assertArrayEquals(expected, arr);  
        System.out.println("Output:");
        MergeSort.printArray(arr);
    }

    // 2 Tests for faultyMergeSort (Not Revealing the Fault)
    @Test
    public void testFaultyMergeSort_LargeSorted() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Input (Faulty - May pass):");
        MergeSort.printArray(arr);

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MergeSort.faultyMergeSort(arr);

        assertArrayEquals(expected, arr);  // This will pass but won't handle unsorted arrays correctly.
        System.out.println("Output:");
        MergeSort.printArray(arr);
    }

    @Test
    public void testFaultyMergeSort_SingleElement() {
        int[] arr = {5};
        System.out.println("Input (Faulty - May pass):");
        MergeSort.printArray(arr);

        int[] expected = {5};
        MergeSort.faultyMergeSort(arr);

        assertArrayEquals(expected, arr);  // This will pass, no sorting needed.
        System.out.println("Output:");
        MergeSort.printArray(arr);
    }

    // 2 Tests for correctedMergeSort (Corrected Method)
    @Test
    public void testCorrectedMergeSort_Unsorted() {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Input (Corrected):");
        MergeSort.printArray(arr);

        int[] expected = {1, 5, 7, 8, 9, 10};
        MergeSort.correctedMergeSort(arr);

        assertArrayEquals(expected, arr);
        System.out.println("Output:");
        MergeSort.printArray(arr);
    }

    @Test
    public void testCorrectedMergeSort_LargeArray() {
        int[] arr = {50, 12, 45, 90, 3, 72, 8, 56, 11, 44};
        System.out.println("Input (Corrected):");
        MergeSort.printArray(arr);

        int[] expected = {3, 8, 11, 12, 44, 45, 50, 56, 72, 90};
        MergeSort.correctedMergeSort(arr);

        assertArrayEquals(expected, arr);
        System.out.println("Output:");
        MergeSort.printArray(arr);
    }
}
