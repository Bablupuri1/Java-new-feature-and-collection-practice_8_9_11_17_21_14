package InterfaceJava8;

interface s1 {
	default void m2() {
		System.out.println("this is s1 interface");
	}
}

interface s2 {
	default void m2() {
		System.out.println("this is s2  interface");
	}
}

public class Bablu implements s1, s2 {

	@Override
	public void m2() {
		s1.super.m2();
		s2.super.m2();

	}

	public static void main(String[] args) {
		Bablu ob = new Bablu();
		ob.m2();

	}

}
