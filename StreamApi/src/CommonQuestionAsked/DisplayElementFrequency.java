package CommonQuestionAsked;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DisplayElementFrequency {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(20);
        
        list.stream()
            .distinct() // to avoid printing same element multiple times
            .forEach(num -> 
                System.out.println(num + " → frequency: " + Collections.frequency(list, num))
            );
    }
}
