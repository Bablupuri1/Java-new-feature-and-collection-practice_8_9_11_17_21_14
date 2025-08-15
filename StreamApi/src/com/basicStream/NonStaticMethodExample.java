package com.basicStream;
import java.util.Arrays;
import java.util.List;

public class NonStaticMethodExample {
	
	
	 public String convertToUpper(String name) {
	        return name.toUpperCase();
	    }
	 
	 
    public static void main(String[] args) {
        List<String> names = Arrays.asList("bablu", "ravi", "amit");

        NonStaticMethodExample obj = new NonStaticMethodExample();

        
        
        names.stream()
            .map(obj::convertToUpper)  // non-static method reference
            .forEach(System.out::println);
    }

   
}
