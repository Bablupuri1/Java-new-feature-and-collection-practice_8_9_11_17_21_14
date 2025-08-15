package Method_And_Constractor_Reference;

interface a {
	public void sum(int a, int b);
}

public class Example {

	public static void m2(int a, int b) {
		System.out.println("sum:" + (a + b));
	}

	public static void main(String[] args) {

//		a ob=(a,b)->{
//			System.out.println("sum:"+(a+b));
//		};

//		ob.sum(10, 10);

		// now instead of sum i use another method reference

		a ob1 = Example::m2;
		ob1.sum(100, 0);

	}

}
