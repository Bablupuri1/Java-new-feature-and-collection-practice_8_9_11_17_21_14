package OOPS_CODE_DECODE;

interface Profession {
	public void working();

}

class Student implements Profession {

	@Override
	public void working() {
		System.out.println("Student is working");

	}

}

class Teacher implements Profession {

	@Override
	public void working() {
		System.out.println("Teacher.working()");
	}

}

class FactoryPattern {
	public Profession getInstance(String type) throws IllegalObjectException {
		if (type.equalsIgnoreCase("teacher")) {
			return new Teacher();
		} else if (type.equalsIgnoreCase("student")) {
			return new Student();
		} else {
			throw new IllegalObjectException("This object cannot exist");

		}

	}
}

public class Factory_Design_Pattern {
	public static void main(String[] args) {

		System.out.println("main method start for execution");
		FactoryPattern ob = new FactoryPattern();
		try {
			Teacher t = (Teacher) ob.getInstance("teachr");
			t.working();
		} catch (IllegalObjectException e) {
			e.printStackTrace();
		}

		System.out.println("main method end");

	}

}
