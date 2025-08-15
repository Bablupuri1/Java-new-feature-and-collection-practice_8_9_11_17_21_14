package MethodReference;

import java.util.Arrays;
import java.util.List;

public class Students {

	String name;

	public Students(String name) {
		this.name = name;
	}

	public Students()
	{

	}

	public void print(Students ob) {
		System.out.println("name:" + ob.getName());
	}



	public String getName()
	{
		return name;
	}
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Bablu", "kundan", "ranjan");

		// using lambda expression

		names.stream().map(sob -> new Students(sob)).forEach(System.out::println);

		names.stream().map(Students::new).forEach(System.out::println);


		Students s= new Students();

		names.stream().map(Students::new).forEach(s::print);






	}

}
