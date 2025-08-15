package CommonQuestionAsked;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverse {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("bablu", "kumar", "java");

        // Create object since method is non-static
        StringReverse sr = new StringReverse();




        // Use object to call non-static method inside map
        List<String> reversedList = names.stream()
            .map(sr::reverseManually)  // method reference to non-static method
            .collect(Collectors.toList());



        System.out.println("Reversed Strings: " + reversedList);
    }






    // Non-static method to manually reverse string

    public String reverseManually(String str)
    {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
