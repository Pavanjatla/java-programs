public class strongnum
{
	public static void main(String args[])
	{
		int n=145,r,fact=1,sum=0,temp,i;
		temp=n;
		while(n!=0)
		{
			r=n%10;
			for(i=1;i<=r;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			fact=1;
			n=n/10;

		}
		if(sum==temp)
		{
			System.out.println("it is a strong number");
		}
		else 
		{
			System.out.println("not a strong number");
		}
	}
}