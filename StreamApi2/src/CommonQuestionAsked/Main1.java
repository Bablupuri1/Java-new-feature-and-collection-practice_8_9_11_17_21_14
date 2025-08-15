package CommonQuestionAsked;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

        // Sorting using Comparator
        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers); // [1, 2, 3, 5, 8, 9]



        List<Integer> numbers1 = Arrays.asList(5, 2, 8, 1, 9, 3);


        //here we can update the value and null alow here immutable object here also
        //but add , delete are not allowed

        // Sorting using lambda (num1 - num2)



        numbers1.sort((num1, num2) -> num1 - num2);

        System.out.println(numbers1); // [1, 2, 3, 5, 8, 9]


        boolean contains = numbers1.contains(2);
        System.out.println(contains);



    }
}
