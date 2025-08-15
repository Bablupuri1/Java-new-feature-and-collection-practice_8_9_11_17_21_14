package Method_And_Constractor_Reference;

import java.util.Arrays;
import java.util.List;

class Bablu
{
	public static void print(String name)
	{
		System.out.println("print method executed");
		System.out.println("Name:"+name);
	}

	public  void print1(String name)
	{
		System.out.println("print method executed");
		System.out.println("Name:"+name);
	}


	public static void m1()
	{
		System.out.println("My name is Bablu");
	}
}


public class MethodReferenceConstractor {

	public static void main(String[] args)
	{
		Runnable r=()->{
			System.out.println("hello");
		};


		Thread t= new Thread(r);
		t.start();

		//now using method reference

		Runnable r1=Bablu::m1;
		Thread t2= new Thread(r1);
		t2.start();



		List<String> students= Arrays.asList("Alice","java");


		students.forEach(Bablu::print);

		//if method is not stataic then first create object then
		//referr

		Bablu b= new Bablu();
		students.forEach(b::print1);





	}
}
