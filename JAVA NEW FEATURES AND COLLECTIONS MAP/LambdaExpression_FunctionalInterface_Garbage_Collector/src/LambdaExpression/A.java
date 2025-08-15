package LambdaExpression;

@FunctionalInterface
public interface A {
	public void m1();

}

@FunctionalInterface
interface B extends A
{

}



@FunctionalInterface
interface bablu
{
	public void b1();

}
@FunctionalInterface
interface kundane extends bablu
{

	@Override
	public void b1();

}





