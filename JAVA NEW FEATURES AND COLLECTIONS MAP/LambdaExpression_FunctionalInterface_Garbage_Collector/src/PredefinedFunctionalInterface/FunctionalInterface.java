package PredefinedFunctionalInterface;

import java.util.function.Function;



class Student
{
	int roll;
	String name;
	int marks;
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}





}
public class FunctionalInterface
{
	public static void main(String[] args)
	{
		Function<String , String> f= s->s;
		String res=f.apply("Java");
		System.out.println(res);
		System.out.println(f.apply("programming"));







		Function<Student, String> list=std->{
			int marks=std.marks;
			String grade="";

			//now check and set the grade

			if(marks>90)
			{
				grade="A";

			}
			else if(marks>70 && marks<90)
			{
				grade="B";
			}
			else if(marks>50 && marks<70)
			{
				grade="C";
			}
			else
			{
				grade="Fail";
			}

			return grade;
		};
		//now used with employee class

		Student[] emparr= {
				new Student(101, "bablu",100),
				new Student(102, "Pankaj",30),
				new Student(103, "Rahul",60),
				new Student(104, "Virat",80)
		};

		//now i can pass the  student arr referrense




		for(Student s: emparr)
		{
			System.out.println("Roll:"+s.roll);
			System.out.println("Name:"+s.name);
			System.out.println("Marks:"+s.marks);
			System.out.println("Grade:"+list.apply(s)+"\n");
		}




	}

}
