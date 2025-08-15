package PredefinedFunctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateJoining {
	public static void main(String[] args) {

	Predicate<Integer> p= num->num%2==0;
	Predicate<Integer> p1=num->num>10;


	//now i want to check if satisify both condition then return true
	//other wise false


	Predicate<Integer> result=p.and(p1);

	System.out.println(result.test(12));


	Function<Integer, Integer> doubleIt = n -> n * 2;
	Function<Integer, Integer> squareIt = n -> n * n;

	Function<Integer, Integer> finalFunc = doubleIt.andThen(squareIt);
	System.out.println(finalFunc.apply(2)); // (2*2)^2 = 16



	//now used or method this method is  belongs to Predicate function interface
	//this is default method not a abstract method



Predicate<Integer> k= num->num%2==0;
Predicate<Integer> k1= num->num>10;


//now check using or method

Predicate<Integer> res=k.or(k1);

System.out.println(res.test(12));







Predicate<Integer> m1= num->num%2==0;
Predicate<Integer> m2= m1.negate();



//now check using negate() method
//which is return reverse of original result
//if  predicate is true then make the result the false

System.out.println("reverse result:"+m2.test(12));
















	}

}
