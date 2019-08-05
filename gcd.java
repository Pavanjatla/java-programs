public class gcd
{
	public static void main(String args[])
	{
		int a=4,b=18;
		int rem,divisor,dividend;
		if(b%a==0)
		{
			System.out.println(a+" is the gcd of two numbers");
		}
		else
		{
			while(true)
			{
				rem=b%a;
				b=a;
				a=rem;
				if(b%a==0)
					break;
			}
			System.out.println(a);
		}
	}
}