package Day5_Array_Pratice;

import java.util.Arrays;

public class sorting {
	public static void main(String[] args) {

//		int arr[]= {10,1,2,3,4,5};
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			for(int j=i+1; j<arr.length; j++)
//			{
//				if(arr[j]>arr[i])
//				{
//					int temp=arr[j];
//					arr[j]=arr[i];
//					arr[i]=temp;
//				}
//			}
//		}
//		
//		System.out.println("After Sorting:"+Arrays.toString(arr));
//		

		// now we want to perform selection sort

		int arr1[] = { 6, 1, 2, 10, 0, 10 };

		// in selection sort we need to find smallest or biggest once and shift in
		// begining

//		int j;

		for (int i = 0; i < arr1.length - 1; i++) {
			System.out.println("index:");
			int min = i;

			for (int j = i + 1; j < arr1.length; j++) {

				System.out.println("Index:");
//				1>6
				if (arr1[min] > arr1[j]) {
					min = j;
				}

			}

			int temp = arr1[min];
			arr1[min] = arr1[i];
			arr1[i] = temp;
		}

		System.out.println("Selection Sort:" + Arrays.toString(arr1));

		System.out.println("Bubble Sort-----------------");

		int arr2[] = { 10, 1, 2, 3, 1 };

		for (int i = 0; i < arr2.length - 1; i++) {
			for (int j = 0; j < arr2.length - i - 1; j++) {
				if (arr2[j + 1] < arr2[j]) {
					int temp = arr2[j + 1];
					arr2[j + 1] = arr2[j];
					arr2[j] = temp;
				}
			}
		}

		System.out.println("Bubble sort:" + Arrays.toString(arr2));

		// display all duplicate element

		int arr3[] = { 1, 2, 3, 1, 2, 4, 5 };
		System.out.println("Array Element:"+Arrays.toString(arr3));
		boolean[] visited = new boolean[arr3.length];

		for (int i = 0; i < arr3.length; i++) {
			// so we need to take one element here

			if (visited[i] == true)
				continue;
			int c = 0;
			for (int j = i + 1; j < arr3.length; j++) {

				// here we nned to copare

				if (arr3[i] == arr3[j]) {
					System.out.println("Duplicate Element:" + arr3[i]);
					c++;
					visited[j] = true;

				}

			}
			
            visited[i] = true;  // ✅ Mark current element as visited too


			if (c >1) {
				System.out.println("Duplicate Element:" + arr3[i]);
			}
			else
			{
				System.out.println("Unique element:"+arr3[i]);
			}
		}

	}

}
