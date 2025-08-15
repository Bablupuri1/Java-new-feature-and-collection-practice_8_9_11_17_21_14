package PrimitiveFunctionalInterface;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class IntFunctionExample {
	public static void main(String[] args) {

		// here input type not compulsary to specify becouse Int function
		IntFunction ob = i -> i * i;
		System.out.println(ob.apply(100));

		DoubleFunction ob1 = num -> num * 10;
		System.out.println(ob1.apply(20));

		LongFunction ob3 = s -> s + 10;
		System.out.println(ob3.apply(100));




		//now DoubleToInt use to convert double to int




		DoubleToIntFunction ob4=n->  (int)n+10;
		System.out.println(ob4.applyAsInt(10.0));




	}

}
