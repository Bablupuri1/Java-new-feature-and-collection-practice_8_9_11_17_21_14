package Day2_Sorting_Challange;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };

		// now may task is 4 3 2 1

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = arr[i];
			arr[i] = temp;
		}

		System.out.println(Arrays.toString(arr));

		int n = 123;

		String res = String.valueOf(n).toString();
		// now again convert into number

		int num2 = Integer.parseInt(res);

		System.out.println(num2);

	}
}
