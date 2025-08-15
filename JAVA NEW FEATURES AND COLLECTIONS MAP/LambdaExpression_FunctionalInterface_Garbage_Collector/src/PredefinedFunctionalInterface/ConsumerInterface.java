package PredefinedFunctionalInterface;

import java.util.function.Consumer;

class Movie {
	String moviename;

	public Movie(String moviename) {
		super();
		this.moviename = moviename;
	}


	public  void display()
	{
		System.out.println("......Welcome....");
		System.out.println("Movie name:"+moviename);
	}

}

public class ConsumerInterface {
	public static void main(String[] args) {

		Consumer<String> c = name -> System.out.println(name);

		c.accept("bablu Kumar");

		Movie ob = new Movie("jaat");

		// now

		Consumer<Movie> c1 = m1 -> System.out.println("Movies release date" + m1.moviename);
		Consumer<Movie> c2 = m1 -> System.out.println("Movies hit or flop" + m1.moviename);
		Consumer<Movie> c3 = m1 -> System.out.println("Movies not release" + m1.moviename);

		// now i want to execute all three cosumer object using method chaining

		System.out.println("method chainig");

		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		cc.accept(ob);










		// i want to use method reference with Consumer



		Consumer<Movie> cbb=Movie::display;


		cbb.accept(new Movie("jaat"));










	}

}
