package CommonQuestionAsked;

import java.util.stream.IntStream;

public class InStreamExample {
	public static void main(String[] args)
	{

		int sum = IntStream.range(1, 10) // 1 se 10 tak (inclusive)
				.sum();
		System.out.println(sum); // 55



		int sum1 = IntStream.rangeClosed(1, 10) // 1 se 10 tak (inclusive)
				.sum();
		System.out.println(sum1); // 55


		IntStream.rangeClosed(1, 10)
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);


		int n = 13;
		boolean allMatch = IntStream.range(2, n/2).allMatch(num -> num % 2 == 0);
		System.out.println(allMatch);




	}

}
