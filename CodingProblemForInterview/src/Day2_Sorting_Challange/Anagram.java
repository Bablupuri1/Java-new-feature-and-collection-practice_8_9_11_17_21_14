package Day2_Sorting_Challange;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String name1 = "listen";
		String name2 = "silent";

		// first of all check the both string length is eaual or not

		if (name1.length() != name2.length())
			return;

		// no so convert into ower acse

		name1 = name1.toLowerCase();
		name2 = name2.toLowerCase();

		// now convert into char array

		char arr1[] = name1.toCharArray();
		char arr2[] = name2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagarm");
		} else {
			System.out.println("Not nagaram");
		}
	}
}
