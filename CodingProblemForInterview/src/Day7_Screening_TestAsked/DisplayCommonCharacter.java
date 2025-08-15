package Day7_Screening_TestAsked;

import java.util.HashSet;

public class DisplayCommonCharacter {

    public static void main(String[] args) {

        String str1 = "appleb";
        String str2 = "babby";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Convert characters to sets
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (char ch : str1.toCharArray()) {
            set1.add(ch);
        }

        for (char ch : str2.toCharArray()) {
            set2.add(ch);
        }

        // Find common characters
        set1.retainAll(set2); 
        // Modifies set1 to only keep common

        System.out.println(" Common Characters:");
        for (char ch : set1) {
            System.out.print(ch + " ");
        }
    }
}
