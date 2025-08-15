package Day2_Sorting_Challange;
public class BubbleSortExample {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr); // Sorting

        System.out.println("Sorted Array (Bubble Sort):");
        printArray(arr);
    }

    // Bubble Sort logic
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for pair-wise comparison
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                	System.out.println("BubbleSortExample.bubbleSort()");
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: Stop if no swap happened (already sorted)
            
            if (swapped==false) {
                break;
            }
        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
