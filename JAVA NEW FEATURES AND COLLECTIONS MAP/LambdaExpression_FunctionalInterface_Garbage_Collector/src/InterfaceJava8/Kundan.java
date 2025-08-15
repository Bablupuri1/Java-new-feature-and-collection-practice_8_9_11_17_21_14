package InterfaceJava8;

interface n1 {
	public void j1();

}

interface n2 {
	public void j1();
	public void j2();


}

public class Kundan  implements n2{
	@Override
	public void j1()
	{
		System.out.println("override j1 m1 method");

	}

	public static void main(String[] args)
	{
		Kundan ob= new Kundan();
		ob.j1();

	}

	@Override
	public void j2() {
		// TODO Auto-generated method stub

	}



}
