package Day2_Sorting_Challange;
public class SelectionSortExample {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};

        System.out.println("Original Array:");
        printArray(arr);

        // Selection Sort logic
        int n = arr.length;
        
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap with current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array (Selection Sort):");
        printArray(arr);
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
