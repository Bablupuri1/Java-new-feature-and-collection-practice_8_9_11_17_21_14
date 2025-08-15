package Day6_RemoveStringSpace;

public class Leapyear {

	public static void main(String[] args) {
		
		int year=2024;
		
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println("Leap Year..");
		}
		else
		{
			System.out.println("not leap Year..");
		}
		
	}
}
