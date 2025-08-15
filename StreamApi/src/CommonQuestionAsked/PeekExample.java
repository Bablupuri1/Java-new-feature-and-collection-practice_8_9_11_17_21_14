package CommonQuestionAsked;
import java.util.*;

public class PeekExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bablu", "Amit", "Ravi", "Neha");

        names.stream()
             .filter(name -> name.startsWith("B"))
             .peek(name -> System.out.println("Filtered value: " + name)) // Debug
             .map(String::toUpperCase)
             .peek(upper -> System.out.println("Uppercase value: " + upper)) // Debug
             .forEach(System.out::println);
        
        
    }
}
