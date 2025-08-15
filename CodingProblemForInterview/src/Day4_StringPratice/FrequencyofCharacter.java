package Day4_StringPratice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyofCharacter {

	public static void main(String[] args) {

		String name = "bablu kumar";

		name = name.trim();

		Map<Character, Integer> charactercount = new HashMap<Character, Integer>();
		// first of all we need to convert string to array

		char[] charArray = name.toCharArray();

		
		for (char c : charArray) {
			
			if(c==' ')
			{
				continue;
			}
			if (charactercount.containsKey(c)) {
				charactercount.put(c, charactercount.get(c) + 1);
				System.out.println("Characater index:" + charactercount.get(c));

			} else {
				charactercount.put(c, 1);

			}
		}

		for(Map.Entry<Character, Integer> map: charactercount.entrySet())
		{
			
		}
	}
}
