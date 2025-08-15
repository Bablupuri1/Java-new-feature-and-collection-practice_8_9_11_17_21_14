package CommonQuestionAsked;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class MaximumAndMinimumManually
{
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 0 };

		Optional<Integer> max = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).findFirst();



		Arrays.sort(arr);


		System.out.println(Arrays.toString(arr));

		Optional<Integer> min = Arrays.stream(arr).boxed().distinct().sorted((a, b) -> a - b).findFirst();

		System.out.println("max:" + max);
		System.out.println("min" + min);



	}

}
