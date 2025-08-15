package Day3_Stream_Challange;

import java.util.ArrayList;

public class Prime {
	
	public    boolean  checkPrime(int num)
	{
		int c=0;
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				
				c++;
			}
		}
		
		return c==2;
		
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println("welome");
		
		ArrayList <Integer>list= new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
//		check all primt number in this list
		Prime ob= new Prime();
		
		list.stream().filter(ob::checkPrime).forEach(System.out::println);
		
		
		
		
	}

}
