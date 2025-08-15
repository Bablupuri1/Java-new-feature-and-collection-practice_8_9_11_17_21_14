package LambdaExpression;

public class MainClass {

	public static void main(String[] args)
	{
		A ob = new A()
		{
			@Override
			public void m1()
			{
				System.out.println("executed..");
			}

		};



		ob.m1();



		// using lambda expressin

		A ob1 = () -> System.out.println("this method is executed using lambda exoressiin");

		ob1.m1();

//		============when one abstract method in parent interface and  one abstract method in child interface which is  same name===========

		bablu b = () -> System.out.println("this is bablu method");
		b.b1();






	}

}
