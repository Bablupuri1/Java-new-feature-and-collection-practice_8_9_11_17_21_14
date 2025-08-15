package PredefinedFunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Students {
	int roll;
	String name;
	int marks;

	public Students(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

}

public class Example {
	public static void main(String[] args) {

		Function<Students, String> list = std -> {
			int marks = std.marks;
			String grade = "";

			// now check and set the grade

			if (marks > 90) {
				grade = "A";

			} else if (marks > 70 && marks < 90) {
				grade = "B";
			} else if (marks > 50 && marks < 70) {
				grade = "C";
			} else {
				grade = "Fail";
			}

			return grade;
		};
		// now used with employee class

		Students[] emparr = { new Students(101, "bablu", 100), new Students(102, "Pankaj", 30),
				new Students(103, "Rahul", 60), new Students(104, "Virat", 80) };

		Consumer<Students> s = s1 -> {
			System.out.println("Roll:" + s1.roll);
			System.out.println("Name:" + s1.name);
			System.out.println("Marks:" + s1.marks);
			System.out.println("Grade:" + list.apply(s1) + "\n");

		};

		// now call the consumer method where we can execute only satisfied condition

		Predicate<Students> std = student -> student.marks > 90;

		for (Students s2 : emparr) {

			if (std.test(s2)) {
				s.accept(s2);
			}

		}

	}

}
