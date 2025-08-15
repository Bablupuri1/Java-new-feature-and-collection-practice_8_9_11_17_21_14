package InterviewAsked_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Pop", "Push", "Add", "Remove");

		Stream<String> stream = names.stream()
		    .filter(s -> {
		        System.out.println("Filtering: " + s);
		        return s.startsWith("P");
		    });

		
		
		
		//  Terminal Operation
		List<String> result = stream.collect(Collectors.toList());

		System.out.println("Result: " + result);
		
		
		
		
		
		
		List<String> namess = Arrays.asList("Pop", "Push", "Add", "Remove");

		namess.stream()
		    .filter(s -> {
		        System.out.println("Filtering: " + s);
		        return s.startsWith("P");
		    })
		    .forEach(System.out::println);  //  terminal operation

		
		
		
		
		
		
		
		

	}

}
