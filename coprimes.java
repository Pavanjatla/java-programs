public class coprimes
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
			//System.out.println(a);
		}
		if(a==1)
		{
			System.out.println("both the given numbers are co primes");
		}
		else
		{
			System.out.println("not a co primes");
		}
	}
}