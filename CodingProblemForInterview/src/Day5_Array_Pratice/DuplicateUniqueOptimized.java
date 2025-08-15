package Day5_Array_Pratice;
import java.util.Arrays;

public class DuplicateUniqueOptimized {
    public static void main(String[] args) {
        int arr3[] = {1, 2, 3, 1, 2, 4, 5};
        System.out.println("Array Elements: " + Arrays.toString(arr3));

        boolean[] visited = new boolean[arr3.length];

        for (int i = 0; i < arr3.length; i++) {
            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[i] == arr3[j]) {
                    count++;
                    visited[j] = true;   // ✅ Mark duplicate as visited
                    visited[i] = true;   // ✅ Mark current as visited (idea from you!)
                }
            }

            // Only print if not duplicate
            if (count > 1) {
                System.out.println("Duplicate Element: " + arr3[i]);
            } else {
                System.out.println("Unique Element: " + arr3[i]);
            }
        }
    }
}
