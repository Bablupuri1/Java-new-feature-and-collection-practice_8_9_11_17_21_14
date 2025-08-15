package CommonQuestionAsked;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverse1 {

    public static void main(String[] args)
    {


        String name = "bablu";
        // Put the string into a list
        ArrayList<String> list = new ArrayList<>();
        list.add(name);

        // Stream + map to reverse string using custom method
        List<String> reversedList = list.stream()
            .map(s -> reverseManually(s))
            .collect(Collectors.toList());
        System.out.println("Reversed String: " + reversedList.get(0));



    }

    // Manual string reverse method (non-static is also OK if you create object)
    public static String reverseManually(String str)
    {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--)
        {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();


    }
}
