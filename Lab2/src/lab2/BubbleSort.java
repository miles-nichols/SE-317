package lab2;

public class BubbleSort {
   
	public static void goodBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped, break the loop
            if (!swapped) {
                break;
            }
        }
    }
	
	public static void faultyBubbleSort(int[] arr) {
		   int n = arr.length;
		    boolean swapped;

		    for (int i = 0; i < n - 1; i++) {
		        swapped = false;
		        // Fault: Start the inner loop from j = 1 instead of j = 0
		        for (int j = 1; j < n - 1 - i; j++) {
		            if (arr[j] > arr[j + 1]) {
		                // Swap arr[j] and arr[j + 1]
		                int temp = arr[j];
		                arr[j] = arr[j + 1];
		                arr[j + 1] = temp;
		                swapped = true;
		            }
		        }

		        // If no two elements were swapped, break the loop
		        if (!swapped) {
		            break;
		        }
		    }
		}
	
	public static void correctedBubbleSort(int[] arr) {
	    int n = arr.length;
	    boolean swapped;

	    for (int i = 0; i < n - 1; i++) {
	        swapped = false;
	        // Correction: Start the inner loop from j = 0 instead of j = 1
	        // This ensures that the first element is included in the sorting process
	        for (int j = 0; j < n - 1 - i; j++) {
	            if (arr[j] > arr[j + 1]) {
	                // Swap arr[j] and arr[j + 1]
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	                swapped = true;
	            }
	        }

	        // If no two elements were swapped, break the loop
	        if (!swapped) {
	            break;
	        }
	    }
	}

    // Method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}