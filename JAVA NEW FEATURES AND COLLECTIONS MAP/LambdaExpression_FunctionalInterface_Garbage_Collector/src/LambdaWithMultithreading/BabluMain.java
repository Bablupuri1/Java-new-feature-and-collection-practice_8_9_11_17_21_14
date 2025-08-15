package LambdaWithMultithreading;

class A implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("this is child thread");
		}
	}
}




public class BabluMain {
	public static void main(String[] args) {

//		A ob= new A();
//		Thread t= new Thread(ob);
//		t.start();
//
//
//		for(int i=0; i<5; i++)
//		{
//			System.out.println("this is main method thread");
//		}


		//now solve using lambda expression


		Runnable r=()->
		{
			for(int i=0; i<5; i++)
			{
				System.out.println("this is child thred");

			}
		};


		Thread t= new Thread(r);
		t.start();


		for(int i=0; i<5; i++)
		{
			System.out.println("main thread");
		}
	}

}
