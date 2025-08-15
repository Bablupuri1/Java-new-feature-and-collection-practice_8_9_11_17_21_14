package InterfaceJava8;


interface v
{
	static void f1()
	{
	 System.out.println("this is v interface");

	}
}

interface v2 extends v
{

	static void f1()
	{
//		v.super.f1();//this is not valide

		//when this method  is default then this is valide
		System.out.println("this is v2 interface");

	}
}

interface MyInterface {
    static void hello() {
        System.out.println("Hello from interface");
    }
}

class MyClass implements MyInterface,v2
{
    // Can't override hello()

	public static void main(String[] args)
	{
		MyInterface.hello();
		v2.f1();


	}
}
