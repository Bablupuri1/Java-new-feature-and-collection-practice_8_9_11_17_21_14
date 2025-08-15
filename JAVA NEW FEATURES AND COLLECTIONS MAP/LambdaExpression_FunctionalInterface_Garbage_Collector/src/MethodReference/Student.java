package MethodReference;

import java.util.ArrayList;

class Employee {
	private String name;
	private String course;

	public Employee(String name, String course) {
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Emmloyee [name=" + name + ", course=" + course + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}

public class Student {

	String name;
	int roll;




	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public static void print() {
		System.out.println("this is print method but ");
	}

	public static void main(String[] args) {
		// i want to understand method reference
		// what is method reference and why use

		// suppose i have one functinal interface and within this
		// interface one abstract method then how it is called

		// first using lambda expression
		Runnable runnable = () -> {
			System.out.println("execute run method");
		};

		// now call the method of the runnable method run
		// but we can not run becouse start method is not there

		Thread t1 = new Thread(runnable);
		t1.start();// here internally execute run method means//here
		// map automatically through lambda expression

		// now using Method reference
		// here method is static

		Runnable r = Student::print;

		Thread t2 = new Thread(r);
		t2.start();

		// this example use create one seprate employee class then try
		// to understand

		// i want to display employee name only using
		// method reference

		Employee e1 = new Employee("Bablu", "BCA");
		Employee e2 = new Employee("Kundan", "Ambani");
		Employee e3 = new Employee("Ranjan", "Btech");
		Employee e4 = new Employee("Raju", "MCA");
		Employee e5 = new Employee("Bikash", "BA");

		ArrayList<Employee> list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

//now display name of the employeee using method reference

		list.stream()
		.map(employee -> employee.getName())
		.forEach(System.out::println);


		list.stream().map(Employee::getName).forEach(System.out::println);




		//

		Student s= new Student("ABC",101);
		Student s2= new Student("DEF",102);


		//suppose now method is  non static then how to use









	}

}
