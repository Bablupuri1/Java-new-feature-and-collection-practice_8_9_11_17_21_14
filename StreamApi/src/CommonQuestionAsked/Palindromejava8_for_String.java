package CommonQuestionAsked;

import java.util.stream.IntStream;

public class Palindromejava8_for_String {

	public static void main(String[] args) {
		
		String str="madaM";
		String name=str.toLowerCase();
		
		
		
		//now we can use IntStream and iterate name.length/2 and  compare agar match ho gya to
		// return true karega
		
		boolean allMatch = IntStream.range(0, str.length()/2).
		allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
		
		
		if(allMatch)
		{
			System.out.println(name+":   Palindrome");
		}
		else
		{
			System.out.println("name:"+"Palindrome");
		}
		
		
		
		
	}
}
