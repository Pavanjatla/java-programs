public class perfectnum
{
	public static void main(String args[])
	{
		int n=10,temp,i,sum=0;
		temp=n;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==temp)
		{
			System.out.println("it is a perfect number");
		}
		else 
		{
			System.out.println("it is not a perfect number");
		}
	}
}