package Day6_RemoveStringSpace;

import java.util.Arrays;

public class ReverseString3 {
	
	static int a=100;
	public static void main(String[] args) {
		
		
		String name="bablu";
		
		char arr[]= name.toCharArray();
		
		for(int i=0; i<arr.length/2; i++)
		{
			char temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
			
			
//			 int temp = arr[i];
//	            arr[i] = arr[n - 1 - i];
//	            arr[n - 1 - i] = temp;
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		a=200;
//		System.out.println(a);
//		
//		ReverseString s1= new ReverseString();
//		System.out.println(s1.a);
//		
//		ReverseString s2= new ReverseString();
//		System.out.println(s2.a);
//		
//		
		

		
	}
	
	


}
