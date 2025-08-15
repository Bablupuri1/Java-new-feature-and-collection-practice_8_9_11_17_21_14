package TwoArgumentFunctionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerInterface {
	public static void main(String[] args)
	{
		// Step 1: Map create karna

		Map<String, Integer> products = new HashMap<>();
		products.put("Pen", 10);
		products.put("Notebook", 5);




		// Step 2: BiConsumer define karna

		BiConsumer<String, Integer> printProduct = (name, qty) -> System.out.println(name + " => " + qty);

		// Step 3: Map ke har entry ke liye accept() method call karna

		products.forEach(printProduct);

















	}
}
