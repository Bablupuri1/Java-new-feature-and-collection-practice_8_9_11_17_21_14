package Day_8_stream_Prime_Palindrome;
public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "madam";

        str = str.toLowerCase();
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
