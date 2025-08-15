package Day2_Sorting_Challange;

public class Palindrome {
	public static void main(String[] args) {
		
		int n=121;
		
		int t=n;
		int rev=0;
		while(n!=0)
		{
			int  rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		System.out.println("Reverse number is:"+rev);
		if(t==rev)
		{
			System.out.println("This is Plaindrome");
			
		}
		else
		{
			System.out.println("Not Pla");
		}
	}

}
