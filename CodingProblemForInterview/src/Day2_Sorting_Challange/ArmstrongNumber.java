package Day2_Sorting_Challange;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153, original = num;
        int sum = 0;

        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is NOT an Armstrong number.");
    }
}
