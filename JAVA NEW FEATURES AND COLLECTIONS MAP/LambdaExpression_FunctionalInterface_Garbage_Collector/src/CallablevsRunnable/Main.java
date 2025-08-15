package CallablevsRunnable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Student implements Runnable {

	@Override
	public void run() {
		System.out.println("Student.run()");

	}

}

class Student1 implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("Student1.call()");

		return "call method executed";
	}

}

public class Main {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Student s = new Student();
		Thread t = new Thread(s);
		t.start();

		System.out.println("______________");

		Student1 s2 = new Student1();
		ExecutorService executor = Executors.newFixedThreadPool(2);

		Future<String> submit = executor.submit(s2);
		System.out.println(submit.get());
	}

}
