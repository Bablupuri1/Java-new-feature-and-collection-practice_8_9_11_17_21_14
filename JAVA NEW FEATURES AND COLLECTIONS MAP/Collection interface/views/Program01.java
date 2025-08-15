package com.nit.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program01 {
public static void main(String[] args) {
	/*  sorting with array 
	Integer [] arr= {5,1,2,6,8};
		for(Integer value:arr) {
			 System.out.print(value+" ");
		}
		System.out.println();
	Arrays.sort(arr);
	System.out.println("\u001B[32m"+"After sorting");
	for(Integer value:arr) {
		 System.out.print(value+" ");
	}*/
	
	/* sorting of array by converting 
	 * array into list
	int [] arr= {5,1,2,6,8};
	
	
	for(Integer value:arr) {
		 System.out.print(value+" ");
	}
	System.out.println();
	List<Integer> data=new ArrayList
			      (Arrays.stream(arr).boxed().toList());
	Collections.sort(data);
    System.out.println("\u001B[32m"+"After sorting");
     for(Integer value:data) {
	 System.out.print(value+" ");*/
	
	 /* sorting with the help
	  * of comparator by using lambda and
	  * ternary operator
	List<Integer> al=Arrays.asList(5,1,2,6,8);
	 
	al.sort((i1,i2)->i1>i2?1:-1);
	System.out.println(al);*/
	
	// sorting based on comparator
	List<Student> data=Arrays.asList
			   (new Student("xyz", 1, 101),
			    new Student("abc", 3, 104),
			    new Student("def", 2, 103));
	
	 for(Student value:data) {
		  System.out.print(value+" ");
	 }
	  System.out.println();
	  // soting based on name
	   Collections.sort(data,new SortByName());
	   for(Student value:data) {
			  System.out.print(value+" ");
		 }
	   // sorting based on id
	   Collections.sort(data,new SortById());
	   for(Student value:data) {
			  System.out.print(value+" ");
		 }
	   // sorting based on code
	   Collections.sort(data, new  SortByCode());
	   for(Student value:data) {
			  System.out.print(value+" ");
		 }
	 
	 
	 /* sorting based on comparable
	  *   drawback 
	  *   _____________
	  *   how many time the logic will change for 
	  *   comparing the object for eg[based on id
	  *   based on name, based on school_code that 
	  *   many time we need to change the logic
	  *   inside the class which implements
	  *   comparable.
	  *   That's why comparator came so that
	  *   we can write a separate class for
	  *   separate purpose.
	  *   
	Collections.sort(data);
	System.out.println();
	System.out.println("After sorting");
	for(Student value:data) {
		  System.out.print(value+" ");
	 }*/
	
   }
}


