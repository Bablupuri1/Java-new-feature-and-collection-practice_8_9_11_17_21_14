package PredefinedFunctionalInterface;

import java.util.function.Predicate;

public class PredicateBablu {
	public static void main(String[] args) {

		String s[] = { "Bablu", "Kundan" };

		Predicate<String> p = s1 -> s1.length() > 5;

		Predicate<Integer> num= nu->nu%2==0;

		System.out.println(num.test(10));


		for (String s1 : s) {
			if (p.test(s1)) {
				System.out.println("this is true");
			}
		}

		Predicate<String> str = name -> name.length() > 2;
		System.out.println(str.test("Java"));

	}

}
