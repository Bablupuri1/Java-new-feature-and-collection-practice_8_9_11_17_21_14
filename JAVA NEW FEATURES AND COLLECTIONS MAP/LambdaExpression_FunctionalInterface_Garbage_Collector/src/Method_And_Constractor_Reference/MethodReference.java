package Method_And_Constractor_Reference;

public class MethodReference {

	public static void m1() {
		System.out.println("this is m1 method instead of run method");
	}

	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("this is run method");
		};

		Thread t1 = new Thread(r);
		t1.start();

		// some rule for if you want must same method paramether
		// if run() no parameter then m1() also no parameter

		// but you can change access modifier and return type

		Runnable r2 = MethodReference::m1;
		Thread t2 = new Thread(r2);
		t2.start();

	}

}
