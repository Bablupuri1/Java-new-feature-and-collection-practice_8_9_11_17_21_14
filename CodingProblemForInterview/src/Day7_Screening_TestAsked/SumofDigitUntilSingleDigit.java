package Day7_Screening_TestAsked;

public class SumofDigitUntilSingleDigit {

	// Method to calculate repeated digit sum
	public static int getSingleDigitSum(int num) {

		
		while (num >= 10) {
			int sum = 0;

			while (num != 0) {
				sum += num % 10;
				num = num / 10;

			}
			num = sum;

		}
		return num;
	}

	public static void main(String[] args) {
		int number = 4356;
		int result = getSingleDigitSum(number);
		System.out.println("Single digit sum of " + number + " is: " + result);
	}
}
