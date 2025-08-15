package OOPS_CODE_DECODE;

class Parent {
	public int salary = 10000;

	public void display() {
		System.out.println("this  is parent salary:" + salary);
	}
}

class Child extends Parent {
	public int salary = 20000;

	@Override
	public void display() {
		System.out.println("this  is child salary:" + salary);
	}

}

public class DataMemberOverriding {
	public static void main(String[] args) {
		// create parent class refreence and but create object of child class

		Parent p = new Child();
		p.display();
		System.out.println("salary:" + p.salary);// here will get parent salary
		System.out.println("");// suppose i have no any salary varibal in child then
		// also invoke parent class data member

		// suppose i have display method in child class
		// if we dont have display method in child class then call parent class display
		// method

		// no need to override in child class this is not compulsary

		// 1. we can implement dynamic polymorphism with instance variable
//	ans=no

		// 2. can

	}
}
