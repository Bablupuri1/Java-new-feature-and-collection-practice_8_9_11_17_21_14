package InterfaceJava8;



interface b1
{
	public void m1();

}
interface b2 extends b1
{
	@Override
	public void m1();
}



interface x1
{
	default void x1()
	{

		System.out.println("this is x1 interface");
	}
}


interface x2 extends x1
{
	@Override
	default void x1()
	{
		System.out.println("this is x2 interface");
	}
}

public class Simple  implements b2,x2
{
	@Override
	public void m1()
	{
		System.out.println("this is abstract  method");

	}


	public static void main(String[] args) {
		Simple ob= new Simple();
		ob.m1();
		ob.x1();

	}






}
