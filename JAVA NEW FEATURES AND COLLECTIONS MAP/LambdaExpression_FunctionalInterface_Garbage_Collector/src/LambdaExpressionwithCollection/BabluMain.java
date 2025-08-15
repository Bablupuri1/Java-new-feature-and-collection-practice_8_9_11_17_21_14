package LambdaExpressionwithCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mycomprator implements Comparator<Integer> {
	int count = 0;

	@Override
	public int compare(Integer o1, Integer o2) {
		count++;
		System.out.println("Comparing " + o1 + " and " + o2 + " | Count: " + count);
//
//		if (o1 > o2) {
//			return +1;
//		} else if (o1 < o2) {
//			return -1;
//		} else {
//			return 0;
//		}

		//i can write like this

		return (o1>o2)?1:(o1<o2)?-1:0;
	}

}

public class BabluMain {
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(10);
		list.add(5);
		list.add(40);

//		Collections.sort(list);//here sort reason becouse Integer class implement Comprable
//		System.out.println(list);// by default sort the list in ascending order


//		System.out.println("After sorting the list ");
//		//now use manually
//
//		Mycomprator comp= new Mycomprator();
//
//		Collections.sort(list, comp);
//		System.out.println(list);
//
//
//		System.out.println("Total comparisons: " + comp.count);
//
//====================now using lambda expression=========================================



		System.out.println("Before Sorting"+list);
		//first create refereence of Comparetor then use lambda expression



		Comparator<Integer> comp=(l1,l2)-> (l1>l2)?1:(l1<l2)?-1:0;

//		Collections.sort(list, comp);
//		System.out.println(list);


//		===================direct uselambda expression in sort method==========



		Collections.sort(list, (l1,l2)->l1-l2);//here
		//l1- l2 equavalant to l1>l1?1:l1<l2?1:0



		System.out.println(list);






	}

}
