package lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
	
	//Two tests for the good bubble sort method

    @Test
    public void testBubbleSortWithUnsortedArray() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        
        BubbleSort.goodBubbleSort(arr);
        
        assertArrayEquals(expected, arr);
    }
    

    @Test
    public void testBubbleSortWithSortedArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        
        BubbleSort.goodBubbleSort(arr);
        
        assertArrayEquals(expected, arr);
    }
    
    //Two tests for the faulty bubble sort method that should fail
    
    @Test
    public void testBubbleSortFaulty_FirstElementShouldMove() {
        int[] arr = {5, 1, 4, 2, 8};
        System.out.println("Input: ");
        BubbleSort.printArray(arr);
        int[] expected = {1, 2, 4, 5, 8}; // Correctly sorted array
        BubbleSort.faultyBubbleSort(arr);
        assertArrayEquals(expected, arr); // This test will fail
        System.out.println("Output: ");
        BubbleSort.printArray(arr);
    }
    
    @Test
    public void testBubbleSortFaulty_FirstElementIsLargest() {
        int[] arr = {9, 3, 1, 4, 2};
        System.out.println("Input: ");
        BubbleSort.printArray(arr);
        int[] expected = {1, 2, 3, 4, 9}; // Correctly sorted array
        BubbleSort.faultyBubbleSort(arr);
        assertArrayEquals(expected, arr); // This test will fail
        System.out.println("Output: ");
        BubbleSort.printArray(arr);
    }
    
    //Two tests for the faulty bubble sort method that should pass
    
    @Test
    public void testBubbleSortFaulty_ArrayAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Input: ");
        BubbleSort.printArray(arr);
        int[] expected = {1, 2, 3, 4, 5}; // Already sorted
        BubbleSort.faultyBubbleSort(arr);
        assertArrayEquals(expected, arr); // This test will pass
        System.out.println("Output: ");
        BubbleSort.printArray(arr);
    }
    
    @Test
    public void testBubbleSortFaulty_FirstElementIsSmallest() {
        int[] arr = {1, 9, 5, 3, 7};
        System.out.println("Input: ");
        BubbleSort.printArray(arr);
        int[] expected = {1, 3, 5, 7, 9}; // Correctly sorted array
        BubbleSort.faultyBubbleSort(arr);
        assertArrayEquals(expected, arr); // This test will pass
        System.out.println("Output: ");
        BubbleSort.printArray(arr);
    }
    
    @Test
    public void testBubbleSortCorrected_FirstElementShouldMove() {
        int[] arr = {5, 1, 4, 2, 8};
        System.out.println("Input: ");
        BubbleSort.printArray(arr);
        int[] expected = {1, 2, 4, 5, 8}; // Correctly sorted array
        BubbleSort.correctedBubbleSort(arr);
        assertArrayEquals(expected, arr); // This test will fail
        System.out.println("Output: ");
        BubbleSort.printArray(arr);
    }
    
    @Test
    public void testBubbleSortCorrected_FirstElementIsLargest() {
        int[] arr = {9, 3, 1, 4, 2};
        System.out.println("Input: ");
        BubbleSort.printArray(arr);
        int[] expected = {1, 2, 3, 4, 9}; // Correctly sorted array
        BubbleSort.correctedBubbleSort(arr);
        assertArrayEquals(expected, arr); // This test will fail
        System.out.println("Output: ");
        BubbleSort.printArray(arr);
    }
    
    
    
}
