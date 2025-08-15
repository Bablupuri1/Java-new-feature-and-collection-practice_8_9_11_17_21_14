public class Switch_Expression {
    public static void main(String[] args) {

        int day = 2;

        String dayName = switch (day) {
            case 1, 2, 3 -> "Sunday";
            case 4 -> "Monday";
            case 5 -> "Tuesday";
            default -> "Invalid day";
        };

        System.out.println(dayName);

        // same link count vowel and cnstant

        char c = 'a';
        int v = 0;
        int cs = 0;

        int resultw = switch (c) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> v++
            default -> cs++;

        };

        System.out.println(resultw);

    }
}