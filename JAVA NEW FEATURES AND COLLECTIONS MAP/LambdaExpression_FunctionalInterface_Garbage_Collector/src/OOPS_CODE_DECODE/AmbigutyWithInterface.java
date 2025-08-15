package OOPS_CODE_DECODE;

interface a {
	public void sleep();

	default void eat() {
		System.out.println("interface a eat");
	}
}

interface b {
	public void sleep();

	default void eat() {
		System.out.println("interface b eat");
	}
}

public class AmbigutyWithInterface implements a, b {

	@Override
	public void sleep() {
		System.out.println("sleeping");

	}



	@Override
	public void eat() {
		// TODO Auto-generated method stub
		a.super.eat();
		b.super.eat();
	}



	public static void main(String[] args) {
		AmbigutyWithInterface ob = new AmbigutyWithInterface();
		ob.sleep();
		ob.eat();
	}

}
