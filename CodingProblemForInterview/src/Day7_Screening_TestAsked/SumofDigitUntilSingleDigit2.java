package Day7_Screening_TestAsked;

public class SumofDigitUntilSingleDigit2 {

    // Method to calculate sum of digits once
    public static int getSingleDigitSum(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        System.out.println("Sum:"+sum);
        return sum;
    }

    public static void main(String[] args) {
        int number =123456;
        int result = getSingleDigitSum(number);

        // Convert to string to check length
        String res = String.valueOf(result);  // e.g., 18
        System.out.println("Res:"+res);

        while (res.length() > 1)
        {
            int int1 = Integer.parseInt(res);      // 18
            int1 = getSingleDigitSum(int1);        // 1 + 8 = 9
            
            
            System.out.println("Intermediate Sum: " + int1);
            res = String.valueOf(int1);            //  update res
        }

        System.out.println("Single digit sum of " + number + " is: " + res);
    }
}
