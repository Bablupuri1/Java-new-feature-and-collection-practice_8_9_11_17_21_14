package Day7_Screening_TestAsked;

public class CountNumber2 {

	public boolean checkAvailable(String str) {
		// only check if string contains '2'
		return str.contains("2");
	}
	
	
	
	
	

	public static void main(String[] args) {
		int c = 0;
		CountNumber2 ob = new CountNumber2();

		for (int i = 0; i <= 35; i++) {
			String s = String.valueOf(i);

			
			if (s.equals("22")) 
			{
				System.out.println("22 counted twice");
				c += 2;  // double count
				
			} 
			
			else if (ob.checkAvailable(s)) 
			{
				System.out.println("Contains 2: " + s);
				c++;  //  normal count
			}
		}
		System.out.println("Output: " + c);
	}
}
