package LambdaExpressionwithCollection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	private String name;
	private int roll;
	public Student(String name, int roll) {
		super();
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
	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
	}







}


public class BabluStudent {
	public static void main(String[] args) {

		ArrayList<Student> list= new ArrayList<>();
		list.add(new Student("Bablu",101));
		list.add(new Student("Kundan",102));
		list.add(new Student("Ranjan",103));
		list.add(new Student("Anjali",105));
		list.add(new Student("Chandani",90));



		//now i want to sort acording to name menas alphabetical order
		System.out.println("Before Sorting:"+list);

		Collections.sort(list, (l1,l2)->l1.getRoll()-l2.getRoll());

		System.out.println("After sorting:"+list);



		System.out.println("After soritn ascending according to thr name");
		Collections.sort(list);//this not valide if want then student class must be implement Comprable

		System.out.println(list);


		//if i want to use lambda expressin then


		Collections.sort(list, (l1,l2)->l1.getRoll()>l2.getRoll()?1:l1.getRoll()<l2.getRoll()?-1:0);

		//in this above example od lamda expression this is

		//equavalant to the

		Collections.sort(list, (l1,l2)->l1.getRoll()-l2.getRoll());





	}

}
