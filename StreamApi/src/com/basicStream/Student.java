package com.basicStream;

import java.util.ArrayList;

public class Student {
	
	
	
	String name;
	int roll;
	
	
	public Student()
	{
		
	}
	
	public   boolean checkeven()
	{
		return 10%2==0;
	}
	
	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> list= new ArrayList();
		
		list.add(new Student("Bablu",236));
		list.add(new Student("Kundan",136));
		list.add(new Student("Ranjan",216));
		
		//now i want to see the name start with b
		
		
		
		
//		Stream s= new List.stream();
		
//		List<Student> collect = list.stream().filter(s->s.getName().startsWith("B")).collect(Collectors.toList());
//		
//		System.out.println(collect);
		
		Student s= new Student();
		
		
//		 list.stream().filter(s::checkeven).forEach(System.out::println);
		
		
		
		
		
		
		
		

	}
	
	
	

}
