package com.basicStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class createStream {
	public static void main(String[] args) {

		// how many way to create stream in java

//		1.  using stream() method of collection interface
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(21);
		list.add(30);
		list.add(41);
		list.add(50);

//		long count = list.stream().filter(n->n%2==0).count();
//		System.out.println(count);

		
		
		
		List<Integer> collect = list.stream().filter(num->num%2==0).collect(Collectors.toList());
		
		

		
		System.out.println(collect);
		System.out.println();
		
		
		
		
		
		

		// now we can create direct or indirect

//		list.stream().forEach(System.out::println);

		// or

//		Stream<Integer> stram = list.stream();

//		stram.forEach(System.out::println);

	}

}
