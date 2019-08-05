import java.lang.*;
import java.util.*;
public class palindrome
{
	public static void main(String args[])
	{
		
		int temp,r,pal=0;
		
		System.out.println("enter a number:");
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		temp=n;
		while(n!=0)
		{
			r=n%10;
			pal=pal*10+r;
			n=n/10;

		}
		if(temp==pal)
		{
			System.out.print("it is a palindrome number");
		}
		else
		{
			System.out.println("not a palindrom number");
		}
	}
}
