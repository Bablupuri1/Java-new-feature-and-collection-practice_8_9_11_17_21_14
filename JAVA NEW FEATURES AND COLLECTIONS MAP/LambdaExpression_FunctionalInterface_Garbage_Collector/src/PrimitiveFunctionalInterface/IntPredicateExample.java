package PrimitiveFunctionalInterface;

import java.util.function.IntPredicate;

public class IntPredicateExample {
	public static void main(String[] args) {
		// IntPredicate takes an int and returns a boolean
		IntPredicate isPositive = num -> num > 0;

		System.out.println(isPositive.test(10)); // true
		System.out.println(isPositive.test(-5)); // false

	}

}
