package CommonQuestionAsked;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondLargestInArray {
	public static void main(String[] args)
	{
		int arr[]= {1,1,1,1};

		//now i want to convert

		Optional<Integer> list=
				Arrays.stream(arr)
				.boxed().distinct().sorted((a,b)->b-a).skip(1).findFirst();
		if(list.isPresent())
		{
			System.out.println("Second Largest is:"+list);
		}
		else
		{
			System.out.println("Second largest not available");
		}



		  int[] arr1 = {10, 20, 5, 8, 20, 30, 30};

	        // Step 1: Pehle stream banake intermediate list banao
	        Stream<Integer> stream = Arrays.stream(arr1).boxed();
	        System.out.println(stream.count());

	        List<Integer> distinctList = stream
	                .distinct()
	                .collect(Collectors.toList());


	        // Step 2: Us intermediate list pe stream chala ke second largest nikaalo
	        Optional<Integer> secondLargest = distinctList.stream()
	            .sorted(Comparator.reverseOrder())
	            .skip(1)
	            .findFirst();

	        if (secondLargest.isPresent()) {
	            System.out.println("Second Largest Element: " + secondLargest.get());
	        } else {
	            System.out.println("Second largest element not found.");
	        }



	}

}
