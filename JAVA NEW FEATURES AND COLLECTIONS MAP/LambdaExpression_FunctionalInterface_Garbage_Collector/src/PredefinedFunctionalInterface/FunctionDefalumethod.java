package PredefinedFunctionalInterface;

import java.util.function.Function;

public class FunctionDefalumethod {
	public static void main(String[] args) {

		Function<String, Integer> str=name->name.length();

		System.out.println(str.apply("bablu"));


		//now used default method

		Function<Integer, Integer> num1=n->n*2;
		Function<Integer, Integer> num2=n->n*n*n;

		//now used

		Function<Integer,Integer> res=num1.andThen(num2);
		System.out.println("add then:"+res.apply(2));

		//means first fuction result take as input for another function call apply method


		//now used compose is also default method of Function
		//it is oppositie of addThen








		Function<Integer, Integer> num3=n->n*2;
		Function<Integer, Integer> num4=n->n*n*n;

		//now used

		Function<Integer,Integer> res1=num1.compose(num2);
		System.out.println("Compose:"+res1.apply(2));




	}

}
