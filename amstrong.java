import java.lang.*;
public class amstrong
{
	public static void main(String args[])
	{
		int n=8,temp,r,m,l=0;
		double power,sum=0;
		temp=m=n;

		while(n!=0)
		{
			l++;
			n=n/10;
		}
		System.out.println(l);
		while(m!=0)
		{
			r=m%10;
			power=Math.pow(r,l);
			sum=sum+power;
			m=m/10;
		}
		if(sum==temp)
		{
			System.out.println(l+sum+"it is an amstrong number");
		}
		else
		{
			System.out.println(l+sum+"it is not a amstrong number");
		}
	}
}