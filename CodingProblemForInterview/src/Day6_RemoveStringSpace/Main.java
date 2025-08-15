package Day6_RemoveStringSpace;
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 10, 6, 2, 8};

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[i]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
