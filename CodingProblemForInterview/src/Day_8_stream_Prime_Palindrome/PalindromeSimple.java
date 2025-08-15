package Day_8_stream_Prime_Palindrome;
public class PalindromeSimple {
    public static void main(String[] args) {
        String str = "Madam";

        // Reverse string using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        // Compare ignoring case
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
